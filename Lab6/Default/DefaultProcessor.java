package Lab6.Default;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DefaultProcessor {
    public static void processAnnotations(Object unit) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Default proto = unit.getClass().getAnnotation(Default.class);
        if (proto != null) {
            System.out.println(unit.getClass().getSimpleName() + " " + proto.value().getSimpleName() + " prototyping");
            Field[] fields = unit.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                field.set(unit, "Default");
            }
        } else {
            System.out.println(unit.getClass().getSimpleName() + " have no default settings");
        }
    }
}
