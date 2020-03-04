package interfaces;

public interface Writeble {
    default public void writeString() {
        System.out.println("Enter");
    }
}
