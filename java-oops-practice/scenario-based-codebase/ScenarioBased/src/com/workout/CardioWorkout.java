package com.workout;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    public double calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.08; // higher burn
        return caloriesBurned;
    }
}
