package com.example.finfun.ui.leader_board;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LeaderBoardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LeaderBoardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is leader board fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}