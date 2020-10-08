package com.example.segurosapp.ui.form;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class FormViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FormViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is form fragment!!!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
