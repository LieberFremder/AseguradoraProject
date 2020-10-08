package com.example.segurosapp.ui.companies;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.segurosapp.R;
import com.example.segurosapp.ui.persons.PersonsViewModel;

public class CompaniesFragment extends Fragment {

    private CompaniesViewModel companiesViewModel;

    public static CompaniesFragment newInstance() {
        return new CompaniesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        companiesViewModel = ViewModelProviders.of(this).get(CompaniesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_companies, container, false);
        companiesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}
