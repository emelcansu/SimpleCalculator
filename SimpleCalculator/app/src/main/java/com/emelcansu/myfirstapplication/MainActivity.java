package com.emelcansu.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;

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

         number1 = findViewById(R.id.number1);
         number2 = findViewById(R.id.number2);
         result = findViewById(R.id.result);


    }
    public void sum(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter Number PLS");
        }else {
            int firstNumber  = Integer.parseInt( number1.getText().toString());
            int secondNumber  = Integer.parseInt( number2.getText().toString());

            int sonuc = firstNumber + secondNumber;

            result.setText("Result: " + sonuc);
        }
    }
    public void deduct(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter Number PLS");
        }else {
            int firstNumber  = Integer.parseInt( number1.getText().toString());
            int secondNumber  = Integer.parseInt( number2.getText().toString());

            int sonuc = firstNumber - secondNumber;

            result.setText("Result: " + sonuc);
        }
    }
    public void multiply(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter Number PLS");
        }else {
            int firstNumber  = Integer.parseInt( number1.getText().toString());
            int secondNumber  = Integer.parseInt( number2.getText().toString());

            int sonuc = firstNumber * secondNumber;

            result.setText("Result: " + sonuc);
        }
    }
    public void divide(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){
            result.setText("Enter Number PLS");
        }else {
            int firstNumber  = Integer.parseInt( number1.getText().toString());
            int secondNumber  = Integer.parseInt( number2.getText().toString());

            int sonuc = firstNumber / secondNumber;

            result.setText("Result: " + sonuc);
        }
    }
}