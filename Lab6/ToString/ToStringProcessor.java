package Lab6.ToString;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ToStringProcessor {
    public static StringBuilder processAnnotations(Object unit) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        StringBuilder result = new StringBuilder();
        for (Field field : unit.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getAnnotation(ToString.class) != null && field.getAnnotation(ToString.class).value() == ToString.Bool.NO) {
                continue;
            } else {
                result.append(field.getName()).append(" = ").append(field.get(unit));
                result.append("\n");
            }
        }
        return result;
    }
}