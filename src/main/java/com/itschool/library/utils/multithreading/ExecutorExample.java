package com.itschool.library.utils.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        Runnable task1 = () -> System.out.println("Task1 executes in a single thread");
        Runnable task2 = () -> System.out.println("Task2 executes in a single thread");

        executor.execute(task1);
        executor.execute(task2);
    }
}