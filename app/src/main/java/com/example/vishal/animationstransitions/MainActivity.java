package com.example.vishal.animationstransitions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    ViewGroup vishLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vishLayout = (ViewGroup) findViewById(R.id.vishLayout);

        vishLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    @Override
                    public boolean onTouch (View v, MotionEvent event){
                        moveButton();
                        return true;
                    }
                }
        );
    }

    public void moveButton(){
        View vishButton = findViewById(R.id.vishButton);

        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        vishButton.setLayoutParams(positionRules);

        ViewGroup.LayoutParams sizeRules = vishButton.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 350;
        vishButton.setLayoutParams(sizeRules);

    }
}
