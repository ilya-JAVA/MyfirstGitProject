package main.java.by.itstep.boris;

public class Num6_3 {
    public static void main(String[] args) {
        int a = 10000000;
        while (a < 100000000){
            a++;
            if (a % 12345 == 0)
                System.out.println(a);
        }
    }
}
