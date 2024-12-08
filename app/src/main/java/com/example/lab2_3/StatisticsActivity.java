package com.example.musyanovichlab23;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StatisticsActivity extends AppCompatActivity {

    private TextView statsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        statsView = findViewById(R.id.stats_view);

        // Display some statistics (for now just static text)
        statsView.setText("Total Workouts: 5\nCalories Burned: 1200");
    }
}
