package com.example.finfun.ui.achievement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.finfun.R;

public class AchievementFragment extends Fragment {

    private AchievementViewModel achievementViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        achievementViewModel =
                new ViewModelProvider(this).get(AchievementViewModel.class);
        View root = inflater.inflate(R.layout.fragment_achievement, container, false);
        final TextView textView = root.findViewById(R.id.text_achievement);
        achievementViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}