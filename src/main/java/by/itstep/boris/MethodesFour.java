package main.java.by.itstep.boris;
import java.util.Scanner;
public class MethodesFour {
    public static void main(String[] args) {
        System.out.println(getInt());
    }
    static int getInt (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input number");
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        } else{
            return getInt();
        }
    }



}
