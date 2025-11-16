package Lab4;

import java.util.ArrayList;
import java.util.List;

public final class UtilString implements Utilities<List<String>, List<Integer>> {
    private UtilString() {
        throw new UnsupportedOperationException("Cant create an instance of this class.");
    }

    @Override
    public List<Integer> apply(List<String> value) {
        List<Integer> counter = new ArrayList<>();
        for (String str : value) {
            counter.add(str.length());
        }
        return counter;
    }
}