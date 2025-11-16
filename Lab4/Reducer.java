package Lab4;

@FunctionalInterface
public interface Reducer<T> {
    T apply(T accumulator, T current);  // Принимает два T, возвращает T
}