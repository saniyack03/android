package com.example.simplecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
     TextView t1, t2;

     EditText e1,e2;

     Button sum,sub,mul,div;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextText3);
        e2 = findViewById(R.id.editTextText4);
        sum = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        mul = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        t1 = findViewById(R.id.textView7);
        t2 = findViewById(R.id.textView11);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1 = Double.parseDouble(e1.getText().toString());
                Double f2 = Double.parseDouble(e2.getText().toString());
                Double cal = f1 + f2;
                t2.setText("addition=" +cal);

            }
        });
       sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Double f1 = Double.parseDouble(e1.getText().toString());
               Double f2 = Double.parseDouble(e2.getText().toString());
               Double cal = f2 - f2;
               t2.setText("subtraction="+cal);
           }
       });
       mul.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Double f1 = Double.parseDouble(e1.getText().toString());
               Double f2 = Double.parseDouble(e2.getText().toString());
               Double cal = f1 * f2;
               t2.setText("multiplication="+cal);
           }
       });
       div.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Double f1 = Double.parseDouble(e1.getText().toString());
               Double f2 = Double.parseDouble(e2.getText().toString());
               Double cal = f1 / f2;
               t2.setText("divison="+cal);
           }
       });

    }
}
