package com.example.finfun.ui.achievement;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AchievementViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AchievementViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is achievement fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}