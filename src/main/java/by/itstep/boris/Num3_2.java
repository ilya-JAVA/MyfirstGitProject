package main.java.by.itstep.boris;
import java.util.Scanner;
public class Num3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int animals = input.nextInt();
        switch (animals){
            case 1:
                System.out.println("Кошка");
                System.out.println("Мяу-мяу");
                break;
            case 2:
                System.out.println("Собака");
                System.out.println("Гав-гав");
                break;
            case 3:
                System.out.println("Курица");
                System.out.println("Ко-ко");
                break;
            case 4:
                System.out.println("Петух");
                System.out.println("Кукареку");
                break;
            case 5:
                System.out.println("Свинья");
                System.out.println("Хрю-хрю");
                break;
            case 6:
                System.out.println("Корова");
                System.out.println("Мууууу");
                break;
            case 7:
                System.out.println("Конь");
                System.out.println("Игаго");
                break;
            case 8:
                System.out.println("Лягушка");
                System.out.println("Ква-ква");
                break;
            case 9:
                System.out.println("Утка");
                System.out.println("Кря-кря");
                break;
            case 10:
                System.out.println("Гусь");
                System.out.println("Га-га");
                break;
            default:
                System.out.println("Ты ввел не то число");
            }
        }
    }

