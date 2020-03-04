package main.java.by.itstep.boris;
import java.util.Scanner;
public class Number10 {
    public static void main(String[] args) {
    Scanner src = new Scanner(System.in);
        System.out.println("Введите b");
        int b = src.nextInt();
        System.out.println("Введите a");
        int a = src.nextInt();
        System.out.println("Введите c");
        int c = src.nextInt();

    double D = Math.pow(b, 2) - 4 * a * c;
        if (D < 0){
            System.out.println("Нет корней");
        } else {
            System.out.println(D);
            }



    }
}
