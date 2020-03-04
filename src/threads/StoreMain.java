package threads;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store();
    Thread thread = new Thread(new ProduceCar(store));
    thread.start();
    Thread thread1 = new Thread(new SaleCar(store));
    thread1.start();

    }



}

class Store{
    private int car = 0;

    public synchronized void addCar(){
        while (car > 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            car++;
            System.out.println("Производитель добавил 1 автомобиль");
            System.out.println("Автомобилей на складе: " + car);
            notify();

    }

    public synchronized void saleCar(){
        while (car < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            car--;
            System.out.println("Покупатель купил 1 автомобиль");
            System.out.println("Автомобилей на складе: " + car);
            notify();

    }
}
class ProduceCar implements Runnable{

    Store store;

    public ProduceCar(Store store) {

        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            store.addCar();
            }
        }
}
class SaleCar implements Runnable {

    Store store;

    public SaleCar(Store store) {

        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            store.saleCar();
        }
    }
}