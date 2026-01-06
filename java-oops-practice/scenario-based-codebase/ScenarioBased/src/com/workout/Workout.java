package com.workout;

abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // minutes
    protected double caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract double calculateCalories(double weight);

    public void startWorkout() {
        System.out.println(type + " workout started.");
    }

    public void stopWorkout() {
        System.out.println(type + " workout stopped.");
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

