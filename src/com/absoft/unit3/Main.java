package com.absoft.unit3;

public class Main {
    public static void main(String[] args) {
        DancingRobot robot = new BalletDancingRobot();
        System.out.println(robot.getDanceType());
        System.out.println(robot.getDanceType2());
        System.out.println(robot.getDefaultDanceType());
    }
}
