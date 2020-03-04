package main.java.by.itstep.boris;
//import main.java.by.itstep.boris.Methodes;
public class MethodeTwo {
    public static void main(String[] args) {
        int c = sum(99, 173);
        System.out.println(c);
        int d = sum(25, 46, 12);
        System.out.println(d);
        Methodes.sayHello("Andrey");

    }

    public static int sum(int a, int b) {
//        int sum = a + b;
//        return sum;
//    }
        return a + b;
    }
    public static int sum(int a, int b, int c) {
     return a + b + c;
    }
}