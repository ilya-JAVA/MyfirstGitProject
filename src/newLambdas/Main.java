package newLambdas;

import lambdas.PrintableTwo;

public class Main {
    public static void main(String[] args) {
//        Printer printer = new Printer();
//        System.out.println(printer.sum(5, 8));
//        Printable printable = new Printable() {
//            @Override
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println(printable.sum(9, 6));
//        System.out.println(printable.getClass());
//
//        Printable printable12 = (a, b) -> a > b ? a : b;
//        System.out.println(printable12.sum(5, 8));
//        System.out.println(printable12.getClass());
//    }
//}
//
//class Printer implements Printable{
//
//
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }

//        PrintableTwo printableTwo = Main::println;
//        printableTwo.info("Hello world");
//
//    }
//    public static void println(String s){
//        System.out.println(s);

        UserCreator userCreator = User::new;
        User user = userCreator.createUser("admin", "12345");
        System.out.printf("Login: %s%nPassword: %s", user.getLogin(), user.getPassword());
    }
}