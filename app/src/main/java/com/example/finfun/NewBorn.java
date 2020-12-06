package com.example.finfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewBorn extends AppCompatActivity implements View.OnClickListener {
    private Button level1, level2, level3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_born);

        level1 =findViewById(R.id.level1);
        level2 =findViewById(R.id.level2);
        level3 =findViewById(R.id.level3);
        level1.setOnClickListener(this);
        level2.setOnClickListener(this);
        level3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.level1:
                i = new Intent(v.getContext(), Level1.class);
                startActivity(i);
                break;

            case R.id.level2:
                i = new Intent(v.getContext(), Level2.class);
                startActivity(i);
                break;

            case R.id.level3:
                i = new Intent(v.getContext(), Level3.class);
                startActivity(i);
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}