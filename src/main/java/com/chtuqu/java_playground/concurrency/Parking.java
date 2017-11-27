package com.chtuqu.java_playground.concurrency;

import java.util.concurrent.Semaphore;

/**
 * Example code illustrating working with Semaphore.
 * The parking lot has less vacant spots than cars willing to park.
 * Some cars have to wait, semaphore ensures maximum number of cars on the parking lot.
 */
public class Parking {

    private static final int NUMBER_OF_SPOTS = 5;
    private static final int NUMBER_OF_CARS = 7;

    private static final boolean[] PARKING_SPOTS = new boolean[NUMBER_OF_SPOTS];
    private static final Semaphore SEMAPHORE = new Semaphore(NUMBER_OF_SPOTS, true);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= NUMBER_OF_CARS; i++) {
            new Thread(new Car(i)).start();
            Thread.sleep(400);
        }
    }

    private static class Car implements Runnable {

        private final int carNumber;

        Car(int carNumber) {
            this.carNumber = carNumber;
        }

        @Override
        public void run() {
            System.out.printf("Car #%d has approached the parking lot.\n", carNumber);

            try {
                SEMAPHORE.acquire();

                int spotNumber = -1;

                synchronized (PARKING_SPOTS) {
                    for (int i = 0; i < PARKING_SPOTS.length; i++) {
                        if (!PARKING_SPOTS[i]) {
                            PARKING_SPOTS[i] = true;
                            spotNumber = i;
                            System.out.printf("Car #%d has parked on spot #%d.\n", carNumber, spotNumber + 1);
                            break;
                        }
                    }
                }

                Thread.sleep(5000);

                synchronized (PARKING_SPOTS) {
                    PARKING_SPOTS[spotNumber] = false;
                }

                SEMAPHORE.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.printf("Car #%d has left the parking lot.\n", carNumber);
        }
    }

}
