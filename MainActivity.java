package com.cs.dal.lab01_helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button;
    TextView textView;
    boolean showingFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setBackgroundResource(R.drawable.change_colour);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                if(showingFirst == true){
                    textView.setTextColor(Color.RED);
                    showingFirst = false;
                }else{
                    textView.setTextColor(Color.BLUE);
                    showingFirst = true;
                }

            } });

    }
;
}
