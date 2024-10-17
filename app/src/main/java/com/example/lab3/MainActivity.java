package com.example.lab3;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button addButtonn = findViewById(R.id.addButton);
        addButtonn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText firstEditText = findViewById(R.id.firstEditText);
                EditText secondEditText = findViewById(R.id.secondEditText);
                TextView result = findViewById(R.id.result);
                int num1 = Integer.parseInt(firstEditText.getText().toString());
                int num2 = Integer.parseInt(secondEditText.getText().toString());
                result.setText(num1+num2+"");
            }
        });
        Button subButton = findViewById(R.id.subButton);
        subButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText firstEditText = findViewById(R.id.firstEditText);
                EditText secondEditText = findViewById(R.id.secondEditText);
                TextView result = findViewById(R.id.result);
                int num1 = Integer.parseInt(firstEditText.getText().toString());
                int num2 = Integer.parseInt(secondEditText.getText().toString());
                result.setText(num1-num2+"");
            }
        });
        Button mulButton = findViewById(R.id.multiplyButton);
        mulButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText firstEditText = findViewById(R.id.firstEditText);
                EditText secondEditText = findViewById(R.id.secondEditText);
                TextView result = findViewById(R.id.result);
                int num1 = Integer.parseInt(firstEditText.getText().toString());
                int num2 = Integer.parseInt(secondEditText.getText().toString());
                result.setText(num1*num2+"");
            }
        });
        Button divButton = findViewById(R.id.divButton);
        divButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText firstEditText = findViewById(R.id.firstEditText);
                EditText secondEditText = findViewById(R.id.secondEditText);
                TextView result = findViewById(R.id.result);
                float num1 = Float.parseFloat(firstEditText.getText().toString());
                float num2 = Float.parseFloat(secondEditText.getText().toString());
                result.setText(num1/num2+"");
            }
        });
    }
}