package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int h;
    int w;
    int z;

    Solution() {
    }

    public Solution(int h) {
        this.h = h;
    }

    protected Solution(int h, int w){
        this.h = h;
        this.w = w;
    }

    private Solution( int h, int w, int z){
        this.h = h;
        this.w = w;
        this.z = z;
    }


    public static void main(String[] args) {

    }
}


class SubSolution extends Solution{
    String name;
    boolean sex;
    int age;

    SubSolution(){

    }

    public SubSolution(int age) {
        this.age = age;
    }




    protected SubSolution(boolean sex, int age){
        this.name = "Chamber";
        this.sex = sex;
        this.age = age;
    }

}

