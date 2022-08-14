package com.example.demo.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMultipleThread {

    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable runnable1 = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My Task1 Started Execution !!");

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("My Task1 ended !!");
                
            }
            
        };


        Runnable runnable2 = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My Task2 Started Execution !!");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


        Runnable runnable3 = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My Task3 Started Execution !!");

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("My Task3 ended !!");
        };



        executorService.submit(runnable1);
        executorService.submit(runnable2);
        executorService.submit(runnable3);

        executorService.shutdown();
    }
    
}
