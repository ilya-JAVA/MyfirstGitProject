package main.java.by.itstep.boris.oop;

public class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Гав Гав!");
        } else if (size > 14) {
            System.out.println("Вуф Вуф!");
        } else {
            System.out.println("Тяф Тяф!");
        }

    }
}
class GoodDogTestDrive{
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(80);
        GoodDog two = new GoodDog();
        two.setSize(8);
        GoodDog three = new GoodDog();
        three.setSize(15);
        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());
        System.out.println("Третяя собака: " + three.getSize());
        one.bark();
        two.bark();
        three.bark();
    }
}