package com.example.demo.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> "Callable Demo";

        Future<String> future = executorService.submit(callable);

        System.out.println(future.get());

    }
    
}
