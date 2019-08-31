package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button nextButton;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextButton=findViewById(R.id.nextButton);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String el1 = num1.getText().toString();
                String el2 =num2.getText().toString();
                Intent intent = new Intent(MainActivity.this,OperationActivity.class);
                intent.putExtra("key1",el1);
                intent.putExtra("key2",el2);
                startActivity(intent);

            }
        });
    }

}
