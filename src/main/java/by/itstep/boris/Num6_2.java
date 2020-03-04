package main.java.by.itstep.boris;
import java.util.Scanner;
public class Num6_2 {
    public static void main(String[] args) {
        Scanner src = new Scanner (System.in);
        System.out.println("Введите год");
        int year = src.nextInt();
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
            System.out.println("Год невисокосный");
        } else {
            System.out.println("Год високосный");
        }


    }
}
