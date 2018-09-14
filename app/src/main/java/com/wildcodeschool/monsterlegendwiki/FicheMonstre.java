package com.wildcodeschool.monsterlegendwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FicheMonstre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_monstre_principale);

        final EditText power =(EditText) findViewById(R.id.ETPower);
        final EditText life =(EditText) findViewById(R.id.ETLife);
        final EditText speed =(EditText) findViewById(R.id.ETSpeed);
        final EditText stamina =(EditText) findViewById(R.id.ETStamina);

        power.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                power.setText("67");
            }
        });
        life.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                life.setText("22");
            }
        });
        speed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                speed.setText("56");
            }
        });
        stamina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stamina.setText("47");
            }
        });

        //Button button1 = (Button) findViewById(R.id.button_search);
    }
}
