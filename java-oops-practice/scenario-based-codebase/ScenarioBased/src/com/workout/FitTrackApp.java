package com.workout;

public class FitTrackApp {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Harshita", 21, 60, "Weight Loss");
        user.printProfile();

        FitnessTracker tracker = new FitnessTracker();

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        tracker.addWorkout(cardio, user);
        tracker.addWorkout(strength, user);

        tracker.showDailyProgress();
    }
}

