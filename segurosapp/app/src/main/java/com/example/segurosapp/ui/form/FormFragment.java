package com.example.segurosapp.ui.form;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.segurosapp.R;
import com.example.segurosapp.ui.companies.CompaniesViewModel;

public class FormFragment extends Fragment {

    private FormViewModel formViewModel;

    public static FormFragment newInstance() {
        return new FormFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        formViewModel = ViewModelProviders.of(this).get(FormViewModel.class);
        View root = inflater.inflate(R.layout.fragment_form, container, false);
        final TextView textView = root.findViewById(R.id.text_form);
        formViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
