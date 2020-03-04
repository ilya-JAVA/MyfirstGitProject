package main.java.by.itstep.boris;

//import java.util.Arrays.;

public class Methodes {
    public static void main(String[] args) {
    int[] arr = {5, 6, 7, 15, 28, 12} ;
        sayHello();
    sayHello("Ilya");
    sayHello("Andrey");
    sayHello(8);
    sayHello(arr);

    }

//    модификаторДоступа static типВозвращаемогоЗначения methodeName(arquments){
//
//    }








    public static void sayHello(){
        System.out.println("Hi boys");
    }
    public static void sayHello(String name){
        System.out.println("Hi " + name);
    }
    public static void sayHello(int a){
        System.out.println(a);
    }
    public static void sayHello(int[] arr){
    //    System.out.println(Arrays.toString(arr));
    }



}
