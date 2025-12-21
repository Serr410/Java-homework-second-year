package Lab6.Cache;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class CacheProcessor {
    public static void processCacheAnnotation(Object unit) {
        System.out.println("Class annotation: " + unit.getClass().getSimpleName());
        if (unit.getClass().isAnnotationPresent(Cache.class)) {
            Cache cacheAnnotation = unit.getClass().getAnnotation(Cache.class);
            String[] cacheAreas = cacheAnnotation.value();
            System.out.println("@Cache found");
            if (cacheAreas.length == 0) {
                System.out.println("Null cache");
            } else {
                System.out.println("Cache area (" + cacheAreas.length + "):");
                for (int i = 0; i < cacheAreas.length; i++) {
                    System.out.println("  " +  (i + 1) + "." +  cacheAreas[i]);
                }
            }
        } else {
            System.out.println("No @Cache found");
        }
    }
}