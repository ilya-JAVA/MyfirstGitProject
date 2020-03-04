package generics;

public class Main {
    public static void main(String[] args) {
//        BoxNoObject boxNoObjectOne = new BoxNoObject(56);
//        BoxNoObject boxNoObjectTwo = new BoxNoObject(34);
//        boxNoObjectOne.getId().equals(boxNoObjectTwo.getId());
//        System.out.println(boxNoObjectOne.getId());
//        System.out.println(boxNoObjectTwo.getId());
//
//        BoxNoObject boxNoObjectThree = new BoxNoObject("sdbfjsbfhbsdbchj s");
//        System.out.println(boxNoObjectThree.getId());
//
//        BoxNoObject boxNoObjectFour = new BoxNoObject(true);
//
//
//        int a = (Integer) boxNoObjectOne.getId();
//
//        boolean bool2 = (Boolean) boxNoObjectFour.getId();
        BoxGeneric<Integer> boxGeneric = new BoxGeneric<>(345345);
        BoxGeneric<Integer> boxGenericOne = new BoxGeneric<>(345345);
        BoxGeneric<String> boxGenericTwo = new BoxGeneric<>("bsbdbdsvjbvs");

        int a = boxGeneric.getId();
        System.out.println(a);
    }
}