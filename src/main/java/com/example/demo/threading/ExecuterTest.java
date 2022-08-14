package com.example.demo.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterTest {
    public static void main(String[] args) {
    
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable runnable1 = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Task 1 runnable 1");
                
            }
            
        };

        Runnable runnable2 = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Task 2 runnable 2");
                
            }
            
        };
        

        executorService.submit(runnable1);
        executorService.submit(runnable2);

        executorService.shutdown();

    }


    
}
