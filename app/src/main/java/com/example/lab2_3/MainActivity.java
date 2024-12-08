package com.example.musyanovichlab23;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView totalWorkouts, totalCalories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalWorkouts = findViewById(R.id.total_workouts);
        totalCalories = findViewById(R.id.total_calories);

        // Update statistics
        updateStatistics();
    }

    public void updateStatistics() {
        // Load from SharedPreferences (or database)
        int workouts = getSharedPreferences("fitness", MODE_PRIVATE).getInt("totalWorkouts", 0);
        int calories = getSharedPreferences("fitness", MODE_PRIVATE).getInt("totalCalories", 0);

        totalWorkouts.setText("Total Workouts: " + workouts);
        totalCalories.setText("Total Calories Burned: " + calories);
    }

    public void goToAddWorkout(View view) {
        Intent intent = new Intent(this, AddWorkoutActivity.class);
        startActivity(intent);
    }

    public void goToHistory(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }

    public void goToTips(View view) {
        Intent intent = new Intent(this, TipsActivity.class);
        startActivity(intent);
    }

    public void goToStatistics(View view) {
        Intent intent = new Intent(this, StatisticsActivity.class);
        startActivity(intent);
    }
}
