package Lab4;

import java.util.ArrayList;
import java.util.List;

public final class UtilInteger implements Utilities<List<Integer>, List<Integer>> {
    private UtilInteger() {
        throw new UnsupportedOperationException("Cant create an instance of this class.");
    }
    @Override
    public List<Integer> apply(List<Integer> value) {
        List<Integer> counter = new ArrayList<>();
        for (int str : value) {
            if (str > 0) {
                counter.add(str);
            } else {
                counter.add(str * (-1));
            }
        }
        return counter;
    }
}
