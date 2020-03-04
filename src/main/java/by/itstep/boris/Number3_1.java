package main.java.by.itstep.boris;

public class Number3_1 {
    public static void main(String[] args) {
    int a = 1;
    int b = 1;
    int c;
        System.out.print(a+" "+b+" ");
        for(int i = 0; i < 10000000; i++){
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();



    }
}
