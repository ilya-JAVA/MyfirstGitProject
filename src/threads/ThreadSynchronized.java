package threads;

public class ThreadSynchronized {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new MyClass.CountThread(new MyClass()));
            thread.setName("Thread" + i);
            thread.start();
        }
    }
}
class MyClass{
    int num;

    void counter(){
        num = 1;
        for (int i = 1; i <= 4; i++) {
            System.out.println(Thread.currentThread().getName() + " start");
            System.out.println(Thread.currentThread().getName() + " " + num);
            num++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished");
}

static class CountThread implements Runnable{

    MyClass myClass;

    public CountThread(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {

        myClass.counter();
//        synchronized (myClass) {
//            myClass.num = 1;
//            for (int i = 1; i <= 4; i++) {
//                System.out.println(Thread.currentThread().getName() + " start");
//                System.out.println(Thread.currentThread().getName() + " " + myClass.num);
//                myClass.num++;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("Thread " + Thread.currentThread().getName() + " finished");
        }
    }
}