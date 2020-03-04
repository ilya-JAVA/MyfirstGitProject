package lambdas;


public class Main {
//    public static int x = 3, y = 8;
    public static void main(String[] args) {
//        CompositionImpl composition = new CompositionImpl();
//        System.out.println(composition.compos (3, 5));
//        int x = 3, y = 8;

//        NewInterf newInterf = () -> {
//            x = 20;
//            return x + y;
//        };

//        System.out.println(newInterf.sum());




//        Composition<Integer> compos = ( x, y) ->
//                x = 20;
//                return x + y;
        Composition<String> compos2 = (x, y) -> x + y;
        Composition<Integer> composition = (x, y) -> x + y;
//        System.out.println(compos.compos(x, y));
        System.out.println(composition.compos(4, 8));
        System.out.println(compos2.compos("45", "56"));


        Composit<Integer> composit = (x, y) -> {
            System.out.println(x + y);
        };

        composit.sum(5, 8);


//        Printable prt = (str) -> System.out.println(str);
//        prt.printString("Hello BOYS");
        // x ->{
//            int a = x * x;
//            return a;
//        }
    }
}
interface Composit<T>{
    void sum (T x, T y);
}