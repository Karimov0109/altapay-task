package com.altapay.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadApplication {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        AtomicInteger counter1 = new AtomicInteger(0);
        AtomicInteger counter2 = new AtomicInteger(0);

        executorService.submit(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter1.incrementAndGet();
                counter2.incrementAndGet();
            }
        });

        executorService.shutdown();

        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Значеник сounter1: " + counter1.get());
        System.out.println("Значение сounter2: " + counter2.get());

        executorService.shutdownNow();
    }
}
