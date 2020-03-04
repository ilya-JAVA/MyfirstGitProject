package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = new Car(3);
        Car car4 = new Car(4);
        Car car5 = new Car(5);


        ArrayList<Car> carArrayList = new ArrayList<>();

        System.out.println(carArrayList.isEmpty());
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(null);
        carArrayList.add(0, car5);
        System.out.println(carArrayList.isEmpty());
        carArrayList.remove(car3);
        for (Car car: carArrayList){
            System.out.println(car.getNum());
        }
        System.out.println(carArrayList.indexOf(car3));
    }
}