package Lab4;

import Lab3.Zavialov.Misc.Dot;

public class DotUtil {
    public static <T extends Dot> void putInTheBox(Box<T> box, T dot) {
        box.putInside(dot);
    }
}
