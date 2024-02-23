package com.example.weeksname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button  button;
    EditText    editText;
    TextView    tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay=findViewById(R.id.tvDisplay);
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  SText=editText.getText().toString();

                if (SText.length()>0){
                    int NedText=Integer.parseInt(SText);
                    if (NedText==1){
                        tvDisplay.setText("শনিবার");
                    } else if (NedText==2) {
                        tvDisplay.setText("রবিবার");
                    }else if (NedText==3) {
                        tvDisplay.setText("সোমবার");
                    }else if (NedText==4) {
                        tvDisplay.setText("মঙ্গলবার");
                    }else if (NedText==5) {
                        tvDisplay.setText("বুধবার");
                    }else if (NedText==6) {
                        tvDisplay.setText("বৃহপতিবার");
                    }else if (NedText==7) {
                        tvDisplay.setText("শুক্রবার");
                    }
                }else {
                    editText.setError("");
                }



            }
        });

    }
}