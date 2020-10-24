package com.example.segurosapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

import java.util.Objects;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("ActivityState: ","onStop");
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        ////Receive message by launcher activity
        Intent i = getIntent();
        //call display method, passing id and cardType parameters
        displayCardInfo(i.getIntExtra("CardId",0), Objects.requireNonNull(i.getStringExtra("CardType")));
        /////
    }
    private void displayCardInfo(int id, String cardType){
        TextView cardTitle = findViewById(R.id.t_title);
        JustifiedTextView cardDescription = findViewById(R.id.t_description);
        ImageView cardPic = findViewById(R.id.i_cardpicture);


        if(cardType.equals("personas"))
        {
            switch (id){
                case 0:
                    cardTitle.setText(R.string.title_cardp_0);
                    cardDescription.setText(R.string.descrip_cardp_0);
                    cardPic.setImageResource(R.drawable.i_vida);
                    break;
                case 1:
                    cardTitle.setText(R.string.title_cardp_1);
                    cardDescription.setText(R.string.descrip_cardp_1);
                    cardPic.setImageResource(R.drawable.i_salud);
                    break;
                case 2:
                    cardTitle.setText(R.string.title_cardp_2);
                    cardDescription.setText(R.string.descrip_cardp_2);
                    cardPic.setImageResource(R.drawable.i_autos);
                    break;
                case 3:
                    cardTitle.setText(R.string.title_cardp_3);
                    cardDescription.setText(R.string.descrip_cardp_3);
                    cardPic.setImageResource(R.drawable.i_hogar);
                    break;
                case 4:
                    cardTitle.setText(R.string.title_cardp_4);
                    cardDescription.setText(R.string.descrip_cardp_4);
                    cardPic.setImageResource(R.drawable.i_arrendamiento);
                    break;
                case 5:
                    cardTitle.setText(R.string.title_cardp_5);
                    cardDescription.setText(R.string.descrip_cardp_5);
                    cardPic.setImageResource(R.drawable.i_educativo);
                    break;
            }
        }
        else
        {
            switch (id) {
                case 0:
                    cardTitle.setText(R.string.title_cardc_0);
                    cardDescription.setText(R.string.descrip_cardc_0);
                    cardPic.setImageResource(R.drawable.i_colectivos);
                    break;
                case 1:
                    cardTitle.setText(R.string.title_cardc_1);
                    cardDescription.setText(R.string.descrip_cardc_1);
                    cardPic.setImageResource(R.drawable.i_empresariales);
                    break;
                case 2:
                    cardTitle.setText(R.string.title_cardc_2);
                    cardDescription.setText(R.string.descrip_cardc_2);
                    cardPic.setImageResource(R.drawable.i_arl);
                    break;
            }
        }
    }

    public void callToPhone(View view) {
        //create intent to open phone app
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:3004508504"));//set the phone number you want to call
        startActivity(i);
    }
}
