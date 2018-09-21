package com.wildcodeschool.monsterlegendwiki;

import android.content.Intent;
import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ListChooseMonsters extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.voyage";

    private ViewPager viewPager;
    private SlideAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_choose_monsters);


        ImageButton openFiche = findViewById(R.id.imageBut1);
        openFiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListChooseMonsters.this, FicheMonstre.class);
                startActivity(intent);
            }


        });
        /*
        Button openStat = findViewById(R.id.but2);
        openStat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListChooseMonsters.this, FicheMonstre.class);
                startActivity(intent);
            }


        });
        */
        viewPager = findViewById(R.id.viewpager);
        myAdapter = new SlideAdapter(this);
        viewPager.setAdapter(myAdapter);
    }
}
