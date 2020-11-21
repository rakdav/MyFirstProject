package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumber;
    private EditText secondNumber;
    private Button buttonEnter;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber=findViewById(R.id.firstNumber);
        secondNumber=findViewById(R.id.secondNumber);
        buttonEnter=findViewById(R.id.buttonEnter);
        result=findViewById(R.id.result);
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(firstNumber.getText().toString());
                int b=Integer.parseInt(secondNumber.getText().toString());
                int S=a+b;
                result.setText(Integer.toString(a)+"+"+Integer.toString(b)+"="+Integer.toString(S));
            }
        });
    }
}