package Lab4;

import java.util.ArrayList;
import java.util.List;

public final class Utilities {
    private Utilities() {
        throw new UnsupportedOperationException("Cant create an instance of this class.");
    }
    public static <T> List<T> task1(List<T> list) {
        if (list != null && !list.isEmpty()) {
            T firstElement = list.getFirst();
            List<Integer> counter = new ArrayList<>();
            if (firstElement instanceof String) {
                for (T str : list) {
                    counter.add(str.toString().length());
                }
            } else if (firstElement instanceof Integer) {
                for (T str : list) {
                    if ((int) str > 0) {
                        counter.add((int)str);
                    } else {
                        counter.add((int)str * (-1));
                    }
                }
            } else if (firstElement instanceof int[]) {
                for (T str : list) {
                    int[] array = (int[]) str;
                    counter.add(array.length);
                }
            }
            return (List<T>) counter;
        }
        return list;
    }
}