package Lab6.Two;

import java.lang.annotation.Annotation;

public class TwoProcessor{

    public static void processAnnotation(Object unit) {
        System.out.println("Class annotation: " + unit.getClass().getSimpleName());
        if (unit.getClass().isAnnotationPresent(Two.class)) {
            Two annotation = unit.getClass().getAnnotation(Two.class);
            System.out.println("Found @Two:");
            System.out.println("  first: " + annotation.first());
            System.out.println("  second: " + annotation.second());
        } else {
            System.out.println("Annotation @Two was not found");
        }
    }
}