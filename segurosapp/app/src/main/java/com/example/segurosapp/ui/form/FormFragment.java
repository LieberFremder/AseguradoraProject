package com.example.segurosapp.ui.form;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.segurosapp.CardActivity;
import com.example.segurosapp.R;
import com.example.segurosapp.ui.companies.CompaniesViewModel;

public class FormFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_form, container, false);
        Button emailBtn = root.findViewById(R.id.b_email);
        sendEmail(emailBtn);
        return root;
    }
    public void sendEmail(Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this function will be executed when btn is clicked
                Log.i("BTN EMAIL","Clicked");
            }
        });
    }

}
