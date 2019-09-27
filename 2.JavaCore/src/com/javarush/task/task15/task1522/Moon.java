package com.javarush.task.task15.task1522;

import javax.management.monitor.Monitor;

public class Moon implements Planet{
    private static Moon instance;

    Moon(){

    }

    public static Moon getInstance() {
        if (instance == null)
        {
            instance = new Moon();
        }
        return instance;
    }
}
