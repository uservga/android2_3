package com.example.musyanovichlab23;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {

    private TextView workoutHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        workoutHistory = findViewById(R.id.workout_history);

        // Display workout history (for now just a static example)
        workoutHistory.setText("1. Running - 30 mins - 300 cal\n2. Swimming - 45 mins - 400 cal");
    }
}
