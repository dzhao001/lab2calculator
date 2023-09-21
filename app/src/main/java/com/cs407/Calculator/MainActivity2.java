package com.cs407.Calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        Integer a = intent.getIntExtra("a", 0);
        Integer b = intent.getIntExtra("b", 0);
        String c = intent.getStringExtra("c");

        if(c.equals("n")) {

            textView.setText("Can only accept integer values");
            return;
        }
        switch (c) {
            case "a":
                textView.setText(String.valueOf(a + b));
                break;
            case "s":
                textView.setText(String.valueOf(a - b));
                break;
            case "m":
                textView.setText(String.valueOf(a * b));
                break;
            case "d":
                if(b == 0) {
                    textView.setText("Cannot divide by zero");
                    break;
                }
                textView.setText(String.valueOf(a / b));;
        }
    }
}