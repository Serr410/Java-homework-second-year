package Lab6.ToString;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {
    enum Bool {
        YES, NO
    }
    Bool value() default  Bool.YES;
}
