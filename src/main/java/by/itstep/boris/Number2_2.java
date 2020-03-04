package main.java.by.itstep.boris;
import java.util.Scanner;
public class Number2_2 {
    public static void main(String[] args) {
    Scanner src = new Scanner(System.in);
        System.out.println("Введите координату x");
    int x = src.nextInt();
        System.out.println("Введите координату y");
    int y = src.nextInt();
    if (x > 0 && y > 0){
        System.out.println("I");
    }
    if (x < 0 && y > 0){
        System.out.println("II");
    }
    if (x < 0 && y < 0){
        System.out.println("III");
    }
    if (x > 0 && y < 0){
        System.out.println("IV");
    }




    }
}
