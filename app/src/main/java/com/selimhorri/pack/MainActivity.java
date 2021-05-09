package com.selimhorri.pack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = findViewById(R.id.textViewId);
        this.button = findViewById(R.id.btnClickId);

        button.setOnClickListener(v -> {
            Toast.makeText(this.getApplicationContext(), R.string.geet_selim, Toast.LENGTH_SHORT).show();
            this.textView.setText(R.string.geet_selim);
        });
    }
}