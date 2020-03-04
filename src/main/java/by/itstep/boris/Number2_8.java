package main.java.by.itstep.boris;
import java.util.Scanner;
public class Number2_8 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Введите x");
        int x = src.nextInt();
        System.out.println("Введите y");
        int y = src.nextInt();
        if (x % 2 == 0 && y % 2 == 0 || x % 2 != 0 && y % 2 != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
            }

    }
}