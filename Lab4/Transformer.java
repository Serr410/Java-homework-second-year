package Lab4;

@FunctionalInterface
public interface Transformer<T, P> {
    P apply(T value);
}