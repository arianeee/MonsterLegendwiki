package com.wildcodeschool.monsterlegendwiki;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class FicheMonstrePrincipale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_monstre_principale);


        EditText power =(EditText) findViewById(R.id.ETPower);
        EditText life =(EditText) findViewById(R.id.ETLife);
        EditText speed =(EditText) findViewById(R.id.ETSpeed);
        EditText stamina =(EditText) findViewById(R.id.ETStamina);
        ImageView img = (ImageView) findViewById(R.id.IVa);
        Button NIV0 = (Button) findViewById(R.id.button0);
        NIV0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText power =(EditText) findViewById(R.id.ETPower);
                EditText life =(EditText) findViewById(R.id.ETLife);
                EditText speed =(EditText) findViewById(R.id.ETSpeed);
                EditText stamina =(EditText) findViewById(R.id.ETStamina);
                power.setText("");
                life.setText("");
                speed.setText("");
                stamina.setText("");

            }
        });

        Button NIV1 = (Button) findViewById(R.id.button1);
        NIV0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText power =(EditText) findViewById(R.id.ETPower);
                EditText life =(EditText) findViewById(R.id.ETLife);
                EditText speed =(EditText) findViewById(R.id.ETSpeed);
                EditText stamina =(EditText) findViewById(R.id.ETStamina);
                //img.setImageResource(R.drawable.fire_lion_3);
                power.setText("");
                life.setText("");
                speed.setText("");
                stamina.setText("");

            }
        });
        Button NIV2 = (Button) findViewById(R.id.button2);
        NIV2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText power =(EditText) findViewById(R.id.ETPower);
                EditText life =(EditText) findViewById(R.id.ETLife);
                EditText speed =(EditText) findViewById(R.id.ETSpeed);
                EditText stamina =(EditText) findViewById(R.id.ETStamina);
                power.setText("");
                life.setText("468");
                speed.setText("");
                stamina.setText("");

            }
        });
        Button NIV3 = (Button) findViewById(R.id.button3);
        NIV3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText power =(EditText) findViewById(R.id.ETPower);
                EditText life =(EditText) findViewById(R.id.ETLife);
                EditText speed =(EditText) findViewById(R.id.ETSpeed);
                EditText stamina =(EditText) findViewById(R.id.ETStamina);
                power.setText("34");
                life.setText("12");
                speed.setText("98");
                stamina.setText("996");

            }
        });


       /* ViewPager vue = findViewById(R.id.view);
        vue.setAdapter(new CustomPagerAdapter(FicheMonstrePrincipale.this)); */

        
    }
}
