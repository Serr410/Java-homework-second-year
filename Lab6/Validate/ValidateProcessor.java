package Lab6.Validate;

public class ValidateProcessor {
    public static void processAnnotation(Object unit) {
        if (unit.getClass().isAnnotationPresent(Validate.class)) {
            Validate validateAnnotation = unit.getClass().getAnnotation(Validate.class);
            Class<?>[] classesToValidate = validateAnnotation.value();
            System.out.println("Class " + unit.getClass().getSimpleName() + " using @Validate");
            System.out.println("Check:");
            for (Class<?> validationClass : classesToValidate) {
                System.out.println("  - " + validationClass.getName());
            }
        } else {
            System.out.println("Class " + unit.getClass().getSimpleName() + " ignores @Validate");
        }
    }
}