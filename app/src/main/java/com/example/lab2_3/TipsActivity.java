package com.example.musyanovichlab23;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TipsActivity extends AppCompatActivity {

    private TextView tipsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        tipsView = findViewById(R.id.tips_view);
        tipsView.setText("1. Warm up before workout\n2. Stay hydrated\n3. Rest between sets");
    }
}
