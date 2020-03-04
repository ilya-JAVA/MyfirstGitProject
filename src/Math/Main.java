package Math;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car(Color.RED);
//        Car car1 = new Car(Color.BLUE);
//        System.out.println(car.getColor());
//        System.out.println(car1.getColor());
//        for(Color col : Color.values()){
//            System.out.println(col);
//        }
        String str = Color.YELLOW.name();
        System.out.println(Color.YELLOW.name());
        System.out.println(Color.YELLOW.ordinal());
        System.out.println(Color.YELLOW.hashCode());
        System.out.println(Color.RED.toString());
        System.out.println(Color.RED.name());
        System.out.println(Color.RED.names);
    }
}
