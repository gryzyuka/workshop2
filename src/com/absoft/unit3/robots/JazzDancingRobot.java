package com.absoft.unit3.robots;

public class JazzDancingRobot extends DancingRobot {

    @Override
    public String getDefaultDanceType() {
        return getDanceType2();
    }

    @Override
    public String getDanceType1() {
        return "Jazz dance 1";
    }

    @Override
    public String getDanceType2() {
        return "Jazz dance 2";
    }
}
