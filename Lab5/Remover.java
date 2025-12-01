package Lab5;

import java.util.ArrayList;
import java.util.List;

public class Remover {
    public static <T> List<T> removeConsecutiveDuplicates(List<T> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }

        List<T> result = new ArrayList<>();
        result.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                result.add(list.get(i));
            }
        }

        return result;
    }
}
