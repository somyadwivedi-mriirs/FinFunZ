package com.example.finfun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Level1 extends AppCompatActivity implements View.OnClickListener{
    private Button level11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        SliderView sliderView = findViewById(R.id.imageSlider);

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.sa_onee);
        imageList.add(R.drawable.sa_two);
        imageList.add(R.drawable.sa_three);

        SmartAdapter smartAdapter = new SmartAdapter(imageList);
        sliderView.setSliderAdapter(smartAdapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.ZOOMOUTTRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);

        level11 =findViewById(R.id.level11);
        level11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()) {
            case R.id.level11:
                i = new Intent(v.getContext(), level11.class);
                startActivity(i);
                break;
        }
        }
}