package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут

        Thread.sleep(3500);

        clock.interrupt();

        if (clock.isInterrupted()){
            System.out.println("Прервано!");
        }
        else {
            System.out.println("Марш!");
        }


    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут

            for (int i = numSeconds; i > 0; i--) {


                System.out.print(numSeconds+" ");
                try {

                    Thread.sleep(1000);
                    numSeconds--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
