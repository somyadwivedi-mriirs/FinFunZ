package com.example.finfun.ui.leader_board;

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

public class LeaderBoardFragment extends Fragment {

    private LeaderBoardViewModel leaderBoardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        leaderBoardViewModel =
                new ViewModelProvider(this).get(LeaderBoardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_leader_board, container, false);
        final TextView textView = root.findViewById(R.id.text_leader_board);
        leaderBoardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}