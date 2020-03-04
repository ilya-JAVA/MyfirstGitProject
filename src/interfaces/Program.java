package interfaces;

import java.util.Scanner;

public class Program implements Printable{
//    @Override
//    public void printLetter() {
//        System.out.println("f");
//    }

    @Override
    public void printWord(String word) {

    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void writeString() {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);

     //   return sc.nextLine();
    }
}
