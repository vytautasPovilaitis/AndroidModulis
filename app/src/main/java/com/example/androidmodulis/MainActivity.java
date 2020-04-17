package com.example.androidmodulis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String HelloText = getString(R.string.HelloWorld);
        Button button1 = (Button) this.findViewById(R.id.button1);
        final TextView textView = (TextView) findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView.setText(HelloText);
            }
        });



    }
}
