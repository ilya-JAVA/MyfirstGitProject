package main.java.by.itstep.boris;

public class MethodesThree {
    public static void main(String[] args) {
        //  System.out.println(fact(6));
        int b = 100000;
        int i = 1;
        while ( i <= b) {
        System.out.println(fibonachi (i) + " ");
        i++;
        }
//    }
//    public static int fact ( int a){
//        if (a == 1 || a == 0) {
//            return 1;
//        } else if (a == 2) {
//            return 2;
//        } else {
//            return fact(a - 1) * a;
//        }
//    }
    }
    static int fibonachi(int n){

    if (n <= 1){
        return n;
    }

    else{
        return fibonachi(n - 2) + fibonachi(n - 1);
    }
}



}



