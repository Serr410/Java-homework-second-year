package Lab4;

@FunctionalInterface
public interface Utilities<T, P> {
    public P apply(T value);
}