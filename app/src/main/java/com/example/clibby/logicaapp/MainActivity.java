package com.example.clibby.logicaapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static String TAG = "PineApple";
    TextView textView1, textView2, textView3, textView4, textView1b, textView2b, textView3b, textView4b;
    TextView input1;
    TextView input2;
    TextView input3;
    TextView input4;
    String toastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        textView1b = findViewById(R.id.textView1b);
        textView2b = findViewById(R.id.textView2b);
        textView3b = findViewById(R.id.textView3b);
        textView4b = findViewById(R.id.textView4b);

        input1 = findViewById(R.id.plain_text_input1);
        input2 = findViewById(R.id.plain_text_input2);
        input3 = findViewById(R.id.plain_text_input3);
        input4 = findViewById(R.id.plain_text_input4);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConditionsCheck();
            }
        });

    }
    protected String ContentCheck(String sCheck, String sCheckb, String input){
        if(sCheck.contains("T") && sCheckb.contains("T") && input.contains("T")){
            return "Correct";
        }
        else return "Incorrect";
    }

    protected void ConditionsCheck(){
        String sCheck = textView1.getText().toString();
        String sCheckb = textView1b.getText().toString();
        String input = input1.getText().toString();
        String field1 = ContentCheck(sCheck,sCheckb,input);

        sCheck = textView2.getText().toString();
        sCheckb = textView2b.getText().toString();
        input = input2.getText().toString();
        String field2 = ContentCheck(sCheck,sCheckb,input);

        sCheck = textView3.getText().toString();
        sCheckb = textView3b.getText().toString();
        input = input3.getText().toString();
        String field3 = ContentCheck(sCheck,sCheckb,input);

        sCheck = textView4.getText().toString();
        sCheckb = textView4b.getText().toString();
        input = input4.getText().toString();
        String field4 = ContentCheck(sCheck,sCheckb,input);

        toastText= "Input 1: " + field1 + ", Input 2: " + field2 + ", input 3: " + field3 + ", input 4: " + field4;
        Toast.makeText(getApplicationContext(),toastText,Toast.LENGTH_LONG).show();
    }
}
