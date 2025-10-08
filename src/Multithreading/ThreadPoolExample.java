package Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor =Executors.newFixedThreadPool(3);
        for (int i = 0; i <=20; i++) {
            int taskId=i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " running in " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
