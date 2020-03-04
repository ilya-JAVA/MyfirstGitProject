package threads;

public class MyTwoThread  implements Runnable{
    private boolean isActive;
    void  disable(){
        isActive = false;
    }
    MyTwoThread(){
        isActive = true;
    }



    @Override
    public void run() {
//        System.out.println("MyTwoThread");
//        Thread.currentThread().setPriority(1);
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Дополнительный поток запущен");
        int count = 1;
        while (isActive){
            System.out.println("Loop " + count++);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().isAlive());
        }
    }
}
