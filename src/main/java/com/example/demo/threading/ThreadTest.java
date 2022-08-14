package com.example.demo.threading;

public class ThreadTest extends Thread {

    public void finalize(){System.out.println("object is garbage collected");}  

    public static void main(String[] args) throws InterruptedException {

        ThreadTest test1 = new ThreadTest();
        ThreadTest test2 = new ThreadTest();
        ThreadTest test3 = new ThreadTest();
        // test1.setPriority(10);
        // test2.setPriority(5);
        // test3.setPriority(9);
        test1.setName("Alok1");
        test2.setName("Alok2");
        test3.setName("Alok3");
        
        test1.start();
        // test1.setDaemon(true);
        // test1.join(2000);
        test2.start();
        // test2.join();
        test3.start();
        testThreadExamples();
        
        // System.gc();
        Runtime r=Runtime.getRuntime();  
        System.out.println(r.availableProcessors());  
        System.out.println("Total Memory: "+r.totalMemory());  
  System.out.println("Free Memory: "+r.freeMemory());  
    }
    
    static void testThreadExamples() {

    }

    public void run() {
        // System.out.println("Thread is running...." + Thread.currentThread().getName());
        // for (int i = 0; i < 5; i++) {
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        //     System.out.println("Thread is running...." + Thread.currentThread().getName());
        // }
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread is running...." + Thread.currentThread().getName());
        } else {
            System.out.println("User Thread is running...." + Thread.currentThread().getName());
        }
    }
}
