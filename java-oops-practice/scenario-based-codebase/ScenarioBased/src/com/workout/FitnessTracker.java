package com.workout;

import java.util.*;

class FitnessTracker {

    private List<Workout> workoutLogs; 
    private int dailyTarget = 500;

    public FitnessTracker() {
        workoutLogs = new ArrayList<>();
    }

    public void addWorkout(Workout workout, UserProfile user) {
        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        workout.stopWorkout();

        workoutLogs.add(workout);
    }

    public void showDailyProgress() {
        double totalBurned = 0;

        for (Workout w : workoutLogs) {
            totalBurned += w.getCaloriesBurned();
        }

        double remaining = dailyTarget - totalBurned; 

        System.out.println("Calories Burned Today: " + totalBurned);
        System.out.println("Remaining Calories to Target: " + remaining);
    }
}
