package com.cs407.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(Integer a, Integer b, String c) {
        Intent intent=new Intent(this, MainActivity2.class);
        intent.putExtra("a", a);
        intent.putExtra("b", b);
        intent.putExtra("c", c);
        startActivity(intent);
    }
    public void add(View view) {
        EditText a = (EditText) findViewById((R.id.editTextText));
        EditText b = (EditText) findViewById((R.id.editTextText2));
        try {
            goToActivity(Integer.parseInt(a.getText().toString()), Integer.parseInt(b.getText().toString()), "a");
        } catch (Exception e) {
            goToActivity(null, null, "n");
        }
    }
    public void subtract(View view) {
        EditText a = (EditText) findViewById((R.id.editTextText));
        EditText b = (EditText) findViewById((R.id.editTextText2));
        try {
            goToActivity(Integer.parseInt(a.getText().toString()), Integer.parseInt(b.getText().toString()), "s");
        } catch (Exception e) {
            goToActivity(null, null, "n");
        }
    }
    public void multiply(View view) {
        EditText a = (EditText) findViewById((R.id.editTextText));
        EditText b = (EditText) findViewById((R.id.editTextText2));
        try {
            goToActivity(Integer.parseInt(a.getText().toString()), Integer.parseInt(b.getText().toString()), "m");
        } catch (Exception e) {
            goToActivity(null, null, "n");
        }
    }
    public void divide(View view) {
        EditText a = (EditText) findViewById((R.id.editTextText));
        EditText b = (EditText) findViewById((R.id.editTextText2));
        try {
            goToActivity(Integer.parseInt(a.getText().toString()), Integer.parseInt(b.getText().toString()), "d");
        } catch (Exception e) {
            goToActivity(null, null, "n");
        }
    }
}