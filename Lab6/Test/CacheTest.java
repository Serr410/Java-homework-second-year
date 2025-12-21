package Lab6.Test;

import Lab6.Cache.Cache;
import Lab6.Cache.CacheClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CacheAnnotationTest {
    CacheClass cache;
    Cache cacheAnnot;

    @BeforeEach
    void setUp() {
        cache = new CacheClass("Test");
    }

    @Test
    void testCacheAnnotationValueReading() {
        cacheAnnot = cache.getClass().getAnnotation(Cache.class);
        String[] cacheAreas = cacheAnnot.value();
        assertNotNull(cacheAnnot);
        assertEquals(3, cacheAreas.length);
        assertArrayEquals(new String[]{"users", "ID", "settings"}, cacheAreas);
    }

    /*@Test
    @DisplayName("Мок-тест для имитации обращения к кешу")  //Do something about Mockito
    void testMockCacheAccess() {
        @Cache({"mockCache"})
        class MockCachedClass {}

        Class<MockCachedClass> mockClass = MockCachedClass.class;
        Cache mockAnnotation = Mockito.mock(Cache.class);

        // Mock поведения аннотации
        when(mockAnnotation.value()).thenReturn(new String[]{"mockCache"});

        String[] cacheAreas = mockAnnotation.value();

        assertEquals(1, cacheAreas.length);
        assertEquals("mockCache", cacheAreas[0]);
        verify(mockAnnotation).value();
    }*/

    // 4. Тест для случая, когда кеш содержит несколько именованных областей
    @Test
    @DisplayName("Тест для нескольких именованных областей кеша")
    void testMultipleNamedCaches() {
        // Arrange
        @Cache({"cache1", "cache2", "cache3", "cache4"})
        class MultiCacheClass {}

        Class<MultiCacheClass> clazz = MultiCacheClass.class;

        // Act
        Cache cacheAnnotation = clazz.getAnnotation(Cache.class);
        String[] cacheAreas = cacheAnnotation.value();

        // Assert
        assertEquals(4, cacheAreas.length);
        assertTrue(Arrays.asList(cacheAreas).contains("cache1"));
        assertTrue(Arrays.asList(cacheAreas).contains("cache2"));
        assertTrue(Arrays.asList(cacheAreas).contains("cache3"));
        assertTrue(Arrays.asList(cacheAreas).contains("cache4"));
    }

    // 5. Параметризованный тест для различных конфигураций кеша
    @ParameterizedTest
    @MethodSource("cacheConfigurations")
    @DisplayName("Параметризованный тест различных конфигураций кеша")
    void testVariousCacheConfigurations(Class<?> clazz, String[] expectedAreas) {
        // Act
        Cache cacheAnnotation = clazz.getAnnotation(Cache.class);
        String[] actualAreas = cacheAnnotation.value();

        // Assert
        assertArrayEquals(expectedAreas, actualAreas);
    }

    private static Stream<Arguments> cacheConfigurations() {
        return Stream.of(
                Arguments.of(CachedService.class, new String[]{"users", "products", "orders"}),
                Arguments.of(NonCachedService.class, new String[]{}),
                Arguments.of(SingleCacheService.class, new String[]{"users"})
        );
    }

    // 6. Тест для обработчика аннотации
    @Nested
    @DisplayName("Тесты обработчика аннотации Cache")
    class CacheAnnotationProcessorTest {

        @Test
        @DisplayName("Тест получения областей кеширования")
        void testGetCacheAreas() {
            // Arrange & Act
            String[] cachedServiceAreas = CacheAnnotationProcessor.getCacheAreas(CachedService.class);
            String[] nonCachedServiceAreas = CacheAnnotationProcessor.getCacheAreas(NonCachedService.class);

            // Assert
            assertArrayEquals(new String[]{"users", "products", "orders"}, cachedServiceAreas);
            assertArrayEquals(new String[]{}, nonCachedServiceAreas);
        }

        @Test
        @DisplayName("Тест обработчика для пустого кеша")
        void testProcessorForEmptyCache() {
            // Этот тест проверяет, что обработчик корректно работает с пустым кешем
            String[] areas = CacheAnnotationProcessor.getCacheAreas(NonCachedService.class);
            assertEquals(0, areas.length);
        }
    }

    // 7. Тест для проверки, что аннотация доступна во время выполнения
    @Test
    @DisplayName("Проверка доступности аннотации во время выполнения")
    void testAnnotationRuntimeAvailability() {
        // Arrange
        Class<CachedService> clazz = CachedService.class;

        // Act
        Annotation[] annotations = clazz.getAnnotations();
        boolean hasCacheAnnotation = Arrays.stream(annotations)
                .anyMatch(annotation -> annotation.annotationType().equals(Cache.class));

        // Assert
        assertTrue(hasCacheAnnotation, "Аннотация @Cache должна быть доступна во время выполнения");
    }

}