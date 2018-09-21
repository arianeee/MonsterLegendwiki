package com.wildcodeschool.monsterlegendwiki;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class fiche_godzilla extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.voyage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_godzilla);

        //ImageView img = (ImageView) findViewById(R.id.IVa);
        Button NIV0 = (Button) findViewById(R.id.button0);
        NIV0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView power =(TextView) findViewById(R.id.ETPower);
                TextView life =(TextView) findViewById(R.id.ETLife);
                TextView speed =(TextView) findViewById(R.id.ETSpeed);
                TextView stamina =(TextView) findViewById(R.id.ETStamina);
               /* Drawable nivo0= getResources().getDrawable(R.drawable.rockillanv0);

                ImageView img = (ImageView) findViewById(R.id.IVa);
                img.setImageDrawable(nivo0);*/
                power.setText("0");
                life.setText("0");
                speed.setText("0");
                stamina.setText("0");

            }
        });

        Button NIV1 = (Button) findViewById(R.id.button1);
        NIV1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView power =(TextView) findViewById(R.id.ETPower);
                TextView life =(TextView) findViewById(R.id.ETLife);
                TextView speed =(TextView) findViewById(R.id.ETSpeed);
                TextView stamina =(TextView) findViewById(R.id.ETStamina);
                /*Drawable nivo1= getResources().getDrawable(R.drawable.rockillanv1);

                ImageView img = (ImageView) findViewById(R.id.IVa);
                img.setImageDrawable(nivo1);*/
                power.setText("34");
                life.setText("23");
                speed.setText("12");
                stamina.setText("1");

            }
        });
        Button NIV2 = (Button) findViewById(R.id.button2);
        NIV2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView power =(TextView) findViewById(R.id.ETPower);
                TextView life =(TextView) findViewById(R.id.ETLife);
                TextView speed =(TextView) findViewById(R.id.ETSpeed);
                TextView stamina =(TextView) findViewById(R.id.ETStamina);
                /*Drawable nivo2= getResources().getDrawable(R.drawable.rockillanv2);

                ImageView img = (ImageView) findViewById(R.id.IVa);
                img.setImageDrawable(nivo2);*/
                power.setText("56");
                life.setText("468");
                speed.setText("23");
                stamina.setText("2134");

            }
        });
        Button NIV3 = (Button) findViewById(R.id.button3);
        NIV3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView power =(TextView) findViewById(R.id.ETPower);
                TextView life =(TextView) findViewById(R.id.ETLife);
                TextView speed =(TextView) findViewById(R.id.ETSpeed);
                TextView stamina =(TextView) findViewById(R.id.ETStamina);
                /*Drawable nivo3= getResources().getDrawable(R.drawable.rockillanv3);

                ImageView img = (ImageView) findViewById(R.id.IVa);
                img.setImageDrawable(nivo3);*/
                power.setText("34");
                life.setText("12");
                speed.setText("98");
                stamina.setText("996");

            }
        });

    }
}
