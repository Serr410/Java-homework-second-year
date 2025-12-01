package Lab5;

import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;

public class QueueCheck {
    public static <T> boolean hasEqualNeighbors(Queue<T> queue) {
        if (queue == null || queue.size() <= 1) {
            return false;
        }
        Iterator<T> iter = queue.iterator();
        T previous = iter.next();
        T first = previous;
        while (iter.hasNext()) {
            T current = iter.next();
            if (Objects.equals(previous, current)) {
                return true;
            }
            previous = current;
        }
        return Objects.equals(previous, first);
    }
}
