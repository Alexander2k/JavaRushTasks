package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.UKRAINE);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country == "Belarus")
            hen = new BelarusianHen();
            else if (country == "Ukraine")
            {
                hen = new UkrainianHen();
            }
            else if (country == "Russia")
            {
                hen = new RussianHen();
            }
            else if (country == "Moldova")
            {
                hen = new MoldovanHen();
            }
            return hen;
        }
    }




}
