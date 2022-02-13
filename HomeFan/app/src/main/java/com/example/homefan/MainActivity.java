package com.example.homefan;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggeButton;
    ImageView imageView;
    ObjectAnimator rotateAnimator;
    Switch switchButton;
    SeekBar seekBar;
    final int SPEED[] = {0,5000,3000,1000};
    GradientDrawable gd = new GradientDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggeButton = (ToggleButton) findViewById(R.id.tombol);
        imageView = (ImageView) findViewById(R.id.fanImage);
        switchButton = (Switch) findViewById(R.id.lampu);
        seekBar = (SeekBar) findViewById(R.id.speedBar);

        rotateAnimator = ObjectAnimator.ofFloat(imageView, "rotation", 0, 360);
        rotateAnimator.setDuration(1000);
        rotateAnimator.setRepeatCount(ValueAnimator.INFINITE);
        rotateAnimator.setInterpolator(new LinearInterpolator());

//        gd.setShape(GradientDrawable.RECTANGLE);
//        gd.setGradientType(GradientDrawable.RADIAL_GRADIENT);
//        gd.setGradientRadius(330);

        toggeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateOn();
            }
        });
    }
    private void rotateOn(){

        //true
        if(toggeButton.isChecked()){
            rotateAnimator.setDuration(SPEED[1]);
            rotateAnimator.start();
        }else{
            rotateAnimator.end();
        }
    }
}
