package Lab4;

import java.util.ArrayList;
import java.util.List;

public final class UtilArray implements Utilities<List<int[]>, List<Integer>> {
    private UtilArray() {
        throw new UnsupportedOperationException("Cant create an instance of this class.");
    }
    @Override
    public List<Integer> apply(List<int[]> value) {
        List<Integer> counter = new ArrayList<>();
        for (int[] str : value) {
            counter.add(((int[]) str).length);
        }
        return counter;
    }
}