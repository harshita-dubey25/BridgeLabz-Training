package com.workout;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    public double calculateCalories(double weight) {
        caloriesBurned = duration * weight * 0.05; // moderate burn
        return caloriesBurned;
    }
}

