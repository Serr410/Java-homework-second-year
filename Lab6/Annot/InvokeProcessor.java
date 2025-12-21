package Lab6.Annot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class InvokeProcessor {
    public static void processAnnotations(Object unit) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        for (Method method : unit.getClass().getDeclaredMethods()) {
            Invoke annotation = method.getAnnotation(Invoke.class);
            if (annotation != null) {
                System.out.println("Get invoked: " + method.getName());
                method.setAccessible(true);
                method.invoke(unit);
            }
        }
    }
}