package com.schokxx.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Layout per Code erstellen (garantiert keine R.id Fehler)
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(android.view.Gravity.CENTER);
        layout.setPadding(50, 50, 50, 50);

        TextView textView = new TextView(this);
        textView.setText("Willkommen bei Schokxx!");
        textView.setTextSize(24);
        textView.setGravity(android.view.Gravity.CENTER);
        
        Button button = new Button(this);
        button.setText("Klick mich");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button wurde gedrückt!", Toast.LENGTH_SHORT).show();
            }
        });

        layout.addView(textView);
        layout.addView(button);

        setContentView(layout);
    }
}
