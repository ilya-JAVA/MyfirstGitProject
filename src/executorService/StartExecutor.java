package executorService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class StartExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Long>> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            MyCallable myCallable = new MyCallable();
//            executorService.submit(myCallable);
            Future<Long> future = executorService.submit(myCallable);
            futureList.add(future);
            if (i == 9){
                executorService.shutdown();
            }
        }
//        for (Future<Long> fl : futureList){
//            try {
//                System.out.println(fl.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//
//        executorService.shutdown();
    }
}

class MyCallable implements Callable<Long>{

    @Override
    public Long call() {
        try {
            System.out.println("Started: " + Thread.currentThread().getId());
            Thread.sleep(1000 + Math.round(Math.random() * 3000));
            System.out.println("Finished: " + Thread.currentThread().getId());
        }catch (Exception e){
            e.printStackTrace();
        }
        return Thread.currentThread().getId();
    }
}