package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public  Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach beach) {
        int d = 0;
        int q = 0;
        if (this.distance < beach.distance)
        {
            d+=1;
        }
        else if (this.distance > beach.distance)
        {
             d-=1;
        }else {
             d+=0;
        }

        if (this.quality > beach.quality)
        {
            q+=1;
        }
        else if (this.quality < beach.quality)
        {
            q-=1;
        }
        else {
            q+=0;
        }
        return d+q;
    }

    public  static void main(String[] args) {


    }


}
