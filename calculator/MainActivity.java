package com.example.calculator;

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

    EditText n1, n2;

    Button sum, sub, mul, div;

    TextView rslt;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.editText1);
        n2 = findViewById(R.id.editText2);
        sum = findViewById(R.id.button3);
        mul = findViewById(R.id.button4);
        div = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        rslt = findViewById(R.id.textView3);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1 +f2;
                rslt.setText("Addition =" + cal);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1 - f2;
                rslt.setText("Subtractiob =" + cal);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1 / f2;
                rslt.setText("Divison =" + cal);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1 * f2;
                rslt.setText("Multiplication =" + cal);

            }
        });

    }
}
