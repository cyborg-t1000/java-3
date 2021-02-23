package hw5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainClass {
        public static final int CARS_COUNT = 4;
        public static void main(String[] args) {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
            Race race = new Race(new Road(60), new Tunnel(CARS_COUNT/2), new Road(40));
            Car[] cars = new Car[CARS_COUNT];
            final CountDownLatch ready = new CountDownLatch(CARS_COUNT);
            final CyclicBarrier start = new CyclicBarrier(CARS_COUNT + 1);
            final CyclicBarrier finish = new CyclicBarrier(CARS_COUNT + 1);
            final Lock winner = new ReentrantLock();
            for (int i = 0; i < cars.length; i++) {
                cars[i] = new Car(race, 20 + (int) (Math.random() * 10), ready, start, finish, winner);
            }

            for (int i = 0; i < cars.length; i++) {
                new Thread(cars[i]).start();
            }
            try {
                ready.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
            try {
                start.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            try {
                finish.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        }
}
