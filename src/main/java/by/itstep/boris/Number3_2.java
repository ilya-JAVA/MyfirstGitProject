package main.java.by.itstep.boris;

public class Number3_2 {
    public static void main(String[] args) {
    int a = 2;
    while (a < 1000000){
        a++;
        if(a % 1 == 0 || a % a == 0){
            System.out.println(a);
            }
    }


    }
}
