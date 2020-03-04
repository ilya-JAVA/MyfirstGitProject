package Excep;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        if (a == 0) {
            try {
                throw new MyException("Ноль нельзя использовать");
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } else {
            try {
                throw new MyException("Ничего нельзя");
            } catch (MyException e) {
                e.printStackTrace();
            }
            System.out.println("nsdvndsjnsvjknsdn");

            //        try {
//         int a = 10;
//         int b = 0;
//
//         if (b != 0){
//             System.out.println(a / b);
//         }else {
//             System.out.println("На ноль делить нельзя");
//         }

//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Прога работает!!!!!");
//        }
//        Car car = new Car();
//        try {
//            car.getInfo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("mdlmsdl");
//
//
//        Factorial factorial = new Factorial();
//        try {
//            factorial.getInf();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        }
    }
}