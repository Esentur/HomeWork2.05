package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OperationActivity extends AppCompatActivity {
    int num_1, num_2;
    Button additionBtn;
    Button substactionBtn;
    Button multiplicationBtn;
    Button divisionBtn;
    TextView num1, num2;
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        num1 = findViewById(R.id.numView1);
        num2 = findViewById(R.id.numView2);
        additionBtn = findViewById(R.id.additionBtn);
        substactionBtn = findViewById(R.id.subtractionBtn);
        multiplicationBtn = findViewById(R.id.multiplicationBtn);
        divisionBtn = findViewById(R.id.divisionBtn);

        Intent intent = getIntent();
        String el1 = intent.getStringExtra("key1");
        String el2 = intent.getStringExtra("key2");
        num1.setText(el1);
        num2.setText(el2);
        num_1 = Integer.parseInt(el1);
        num_2 = Integer.parseInt(el2);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.additionBtn:
                result = num_1 + num_2;
                Intent intent = new Intent(OperationActivity.this, ResultActivity.class);
                intent.putExtra("result",result);
                startActivity(intent);
                break;
            case R.id.subtractionBtn:
                result = num_1 - num_2;
                Intent intent2 = new Intent(OperationActivity.this, ResultActivity.class);
                intent2.putExtra("result",result);
                startActivity(intent2);
                break;
            case R.id.multiplicationBtn:
                result = num_1 * num_2;
                Intent intent3 = new Intent(OperationActivity.this, ResultActivity.class);
                intent3.putExtra("result",result);
                startActivity(intent3);
                break;
            case R.id.divisionBtn:
                    result = num_1 / num_2;
                Intent intent4 = new Intent(OperationActivity.this, ResultActivity.class);
                intent4.putExtra("result",result);
                startActivity(intent4);
                break;
        }
    }

}
