package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable {

    private int hitCount;
    private String name;

    public abstract Object getName();

    @Override
    public BodyPart defense() {
        return null;
    }

    @Override
    public BodyPart attack() {
        return null;
    }
}
