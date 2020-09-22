package com.example.segurosapp.ui.persons;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class PersonsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PersonsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is persons fragment!!!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
