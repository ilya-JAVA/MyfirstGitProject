package lambdas;


@FunctionalInterface
public interface Composition<T> {
    public T compos(T x, T y);
}