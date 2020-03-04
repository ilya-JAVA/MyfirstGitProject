package interfaces;

public class Array implements IShow{
    int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void print() {
        System.out.print("[ ");
        for (int a : arr){
            System.out.print(a + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    @Override
    public void print(String info) {
        System.out.print("[ ");
        for (int a : arr){
            System.out.print(a + ", ");
        }
        System.out.print("]");
        System.out.println(info);
        System.out.println();
    }
}
