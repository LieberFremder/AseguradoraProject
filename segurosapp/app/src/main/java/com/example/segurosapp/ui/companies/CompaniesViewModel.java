package com.example.segurosapp.ui.companies;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CompaniesViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CompaniesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is companies fragment!!!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
