package com.example.myemptyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addBotton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             // declare variables from what the user has entered
                EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberEditText);
                EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                // get the current values from the declared objects
                // (remember these are the controls on the screen)
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
                int result = firstNumber + secondNumber;

                // update the result view on the screen
                resultTextView.setText(result + " ");
            }
        });
    }
}
