package com.example.dalalalmutawa.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.PublicKey;

import static android.R.attr.checked;
import static android.R.attr.duration;
import static android.R.attr.id;
import static com.example.dalalalmutawa.quizapp.R.id.RadioGroupQ1;
import static com.example.dalalalmutawa.quizapp.R.id.RadioGroupQ2;
import static com.example.dalalalmutawa.quizapp.R.id.RadioGroupQ4;

public class MainActivity extends AppCompatActivity {
    EditText Q5 ;
    EditText nameEditText ;

    RadioGroup RadioGroupQ1;
    RadioGroup RadioGroupQ2;
    RadioGroup RadioGroupQ4;
    CheckBox FourWomen ;
    CheckBox TwoMen ;
    CheckBox ThreeWomen ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        Q5 = (EditText) findViewById(R.id.Q5);

        FourWomen = (CheckBox) findViewById(R.id.FourWomen);
        TwoMen = (CheckBox) findViewById(R.id.TwoMen);
        ThreeWomen = (CheckBox) findViewById(R.id.ThreeWomen);
        RadioGroupQ1 = (RadioGroup) findViewById(R.id.RadioGroupQ1);
        RadioGroupQ2 = (RadioGroup) findViewById(R.id.RadioGroupQ2);
        RadioGroupQ4 = (RadioGroup) findViewById(R.id.RadioGroupQ4);
    }
    public void SubmitOnClick (View view) {
        String toast = "Welcome " + nameEditText.getText().toString();
        int score = 0 ;
        if ( R.id.SixRadioButton == RadioGroupQ1.getCheckedRadioButtonId()) {
            toast += "\n Q1:correct answer ";
            score++; }
        else
            toast += "\n Q1:wrong answer,  correct answer 6 ";
        if(FourWomen.isChecked()&& TwoMen.isChecked() && !ThreeWomen.isChecked())
        { toast += "\n Q2:correct answer ";
            score++; }
        else
            toast += "\n Q2:wrong answer,  correct answer Four Women and Two Men ";
        if (R.id.Working==RadioGroupQ2.getCheckedRadioButtonId())
        {  toast += "\n Q3:correct answer ";
            score++; }
        else
            toast += "\n Q3:wrong answer,  correct answer Working ";
        if (R.id.Yes==RadioGroupQ4.getCheckedRadioButtonId())
        { toast += "\n Q4:correct answer ";
            score++; }
        else
            toast += "\n Q4:wrong answer,  correct answer Yes  ";

        if (Q5.getText().toString().equalsIgnoreCase("blue")) {
            toast += "\n Q5:correct answer ";
            score++; }
        else
            toast += "\n Q5:wrong answer,  correct answer blue  ";

        toast+="\n Your score is :"+score+"/5";
        Toast.makeText(this, toast+"", Toast.LENGTH_SHORT).show();
    }
}







