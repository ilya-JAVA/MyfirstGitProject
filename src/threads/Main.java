package threads;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("It' main thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        MyTwoThread myTwoThread = new MyTwoThread();
        Thread thread = new Thread(myTwoThread);
        thread.start();

        MyThread myThread = new MyThread();
        try {
            Thread.sleep(5000);
            System.out.println();
            myThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myTwoThread.disable();
    }
}
