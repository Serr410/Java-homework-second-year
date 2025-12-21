package Lab6.Test;

import Lab6.Default.Default;
import Lab6.Default.DefaultClass;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DefaultAnnotationTest {
    DefaultClass def;
    Default annotation;

    @BeforeEach
    void setup() {
        def = new DefaultClass("Test");
    }

    @Test
    void testDefaultAnnotationValue() {
        annotation = def.getClass().getAnnotation(Default.class);
        assertNotNull(annotation, "@Default does not exist");
        assertEquals(String.class, annotation.value(), "Expected value is not equal to @Default");
    }

    @Test
    void testDefaultAnnotationOnField() throws NoSuchFieldException {
        Field[] fields = def.getClass().getDeclaredFields();
        for (Field field : fields) {
            annotation = field.getAnnotation(Default.class);
            assertNotNull(annotation, "There is no annotation");
            assertEquals(String.class, annotation.value(), "Expected value is not equal to @Default");
        }
    }

    @ParameterizedTest
    @MethodSource("provideClassesForTesting")
    void testSeveralTypes(Object unit, Object expectedDefaultClass) {
        annotation = def.getClass().getAnnotation(Default.class);
        assertNotNull(annotation, "There is no annotation");
        assertEquals(expectedDefaultClass, annotation.value(), "Expected value is not equal to @Default");
    }

    private static Stream<Arguments> provideClassesForTesting() {
        return Stream.of(Arguments.of(DefaultClass.class, String.class), Arguments.of(String.class, String.class));
    }
}