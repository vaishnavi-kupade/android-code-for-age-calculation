package com.example.calculator_age;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
public class MainActivity extends AppCompatActivity {
    EditText edit_text;
    Button btn_cal;
    TextView txt_view1, txt_view2;
    private Calendar Calender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text=findViewById(R.id.edit_text1);
        btn_cal=findViewById(R.id.btn);
        txt_view2=findViewById(R.id.txtview2);
        edit_text.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String userDOB = edit_text.getText().toString().trim();
                int year = Calender.getInstance().get(Calender.YEAR);
                if(userDOB.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter a Birth Year...",Toast.LENGTH_SHORT).show();
                }
                else if(userDOB.compareTo(String.valueOf(year))>0){
                    Toast.makeText(MainActivity.this,"Your Birth-Year is should be Less than Year ...",Toast.LENGTH_SHORT).show();
                }
                else{
                    int myAge=year-Integer.parseInt(userDOB);
                    txt_view2.setText("Your Age is : " +myAge+ "years.");
                }
            }
        });
    }
}