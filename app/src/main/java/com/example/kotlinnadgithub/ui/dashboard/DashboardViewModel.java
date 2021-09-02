package com.example.kotlinnadgithub.ui.dashboard;

import android.widget.EditText;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kotlinnadgithub.R;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private EditText user,pass;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");



    }

    public LiveData<String> getText() {
        return mText;
    }
}