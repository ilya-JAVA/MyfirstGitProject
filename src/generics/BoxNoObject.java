package generics;

public class BoxNoObject {

    private Object id;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public BoxNoObject(Object id) {
        this.id = id;
    }

    public BoxNoObject() {
    }
}
