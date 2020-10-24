package com.example.segurosapp.ui.persons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.segurosapp.CardActivity;
import com.example.segurosapp.MainActivity;
import com.example.segurosapp.R;

public class PersonsFragment extends Fragment {

    GridLayout mainGrid;//grid object where each Card is located

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_persons, container, false);
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
                    //this event will be called when a specific card is clicked
                    Intent i = new Intent(getActivity(), CardActivity.class);
                    i.putExtra("CardId",cardID);
                    i.putExtra("CardType","personas");
                    startActivity(i);
                }
            });
        }
    }
}
