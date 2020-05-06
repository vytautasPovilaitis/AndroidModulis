package com.example.androidmodulis;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static com.example.androidmodulis.Functions.countChars;
import static com.example.androidmodulis.Functions.countWords;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText EditText1 = (EditText) this.findViewById(R.id.editText);
        Button button1 = (Button) this.findViewById(R.id.button1);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final Spinner spinner = this.findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_array, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        final String spinnerType = spinner.getSelectedItem().toString();
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String EditText1Value = EditText1.getText().toString();
                String spinnerValue = spinner.getSelectedItem().toString();
                int setTextValue;

                if(EditText1Value.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.textFieldEmpty, Toast.LENGTH_LONG).show();

                }else{

                    if(spinnerValue.equals("Words")){
                        Toast.makeText(MainActivity.this, "Words", Toast.LENGTH_LONG).show();
                        setTextValue = countWords(EditText1Value);

                    }else{
                        Toast.makeText(MainActivity.this, "Chars", Toast.LENGTH_LONG).show();
                        setTextValue = countChars(EditText1Value);
                    }

                    textView.setText(Integer.toString(setTextValue));
                }
            }
        });
    }
}
