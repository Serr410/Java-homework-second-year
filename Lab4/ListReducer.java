package Lab4;

import java.util.ArrayList;
import java.util.List;

public class ListReducer {
    public static <T> T reduceList(List<T> list, Reducer<T> reducer, T defaultValue) {
        if (list == null || list.isEmpty()) {
            return defaultValue;
        }

        T result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = reducer.apply(result, list.get(i));
        }
        return result;
    }
}