package com.example.segurosapp.ui.companies;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.example.segurosapp.CardActivity;
import com.example.segurosapp.MainActivity;
import com.example.segurosapp.R;

public class CompaniesFragment extends Fragment {

    GridLayout mainGrid;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_companies, container, false);
        mainGrid = root.findViewById(R.id.mainGrid);
        cardClickedEvent(mainGrid);
        return root;
    }
    private void cardClickedEvent(GridLayout mainGrid){
        for(int i = 0; i < mainGrid.getChildCount(); i++){

            final int cardID = i; //ID of each Card starting at 0(first on the left), 1(first on the right), 2(first on the left), etc
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //this function will be executed when a specific card is clicked
                    Intent i = new Intent(getActivity(), CardActivity.class);
                    i.putExtra("CardId",cardID);//cardID has the value (ID) of the clicked card
                    i.putExtra("CardType","empresas");
                    startActivity(i);
                }
            });
        }
    }
}
