package threads;

public class MyThread extends Thread {
    @Override
    public void run() {

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("It's new thread");
        //Thread.currentThread().setName("Our new Thread");
        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
        int count = 1;
        while (!isInterrupted()){
            System.out.println("Loop " + count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}