package generics;

public class BoxGeneric<T> {
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public BoxGeneric(T id) {
        this.id = id;
    }

    public BoxGeneric() {
    }
}
