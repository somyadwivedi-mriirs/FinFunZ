package com.example.finfun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Level2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        SliderView sliderView = findViewById(R.id.imageSlider);

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.tree);
        imageList.add(R.drawable.taaz);
        imageList.add(R.drawable.piggi);

        SmartAdapter smartAdapter = new SmartAdapter(imageList);
        sliderView.setSliderAdapter(smartAdapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.ZOOMOUTTRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);

    }
}