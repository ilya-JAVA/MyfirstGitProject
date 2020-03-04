package main.java.by.itstep.boris;
import java.util.Scanner;
public class Number8 {
    public static void main(String[] args) {
    Scanner src = new Scanner (System.in);
    int i = src.nextInt();
    if (i >= 0 && i <= 10){
        System.out.println("Доброе утро");
    }
    if (i >= 11 && i <= 15){
        System.out.println("Добрый день");
    }
    if (i >= 16 && i <= 24){
        System.out.println("Добрый вечер");
    }


    }
}
