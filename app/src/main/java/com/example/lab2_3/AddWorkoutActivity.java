package com.example.musyanovichlab23;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddWorkoutActivity extends AppCompatActivity {

    private EditText workoutType, workoutDuration, workoutCalories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_workout);

        workoutType = findViewById(R.id.workout_type);
        workoutDuration = findViewById(R.id.workout_duration);
        workoutCalories = findViewById(R.id.workout_calories);
    }

    public void saveWorkout(View view) {
        String type = workoutType.getText().toString();
        String duration = workoutDuration.getText().toString();
        int calories = Integer.parseInt(workoutCalories.getText().toString());

        // Save workout in SharedPreferences
        SharedPreferences prefs = getSharedPreferences("fitness", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        int totalWorkouts = prefs.getInt("totalWorkouts", 0);
        int totalCalories = prefs.getInt("totalCalories", 0);

        editor.putInt("totalWorkouts", totalWorkouts + 1);
        editor.putInt("totalCalories", totalCalories + calories);
        editor.apply();

        Toast.makeText(this, "Workout Saved!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
