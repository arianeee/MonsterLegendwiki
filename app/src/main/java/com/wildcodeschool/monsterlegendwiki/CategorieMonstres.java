package com.wildcodeschool.monsterlegendwiki;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class CategorieMonstres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie_monstres);

        final ImageButton button_gold = findViewById(R.id.buttongold);
        button_gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorieMonstres.this, gold_farming.class);
                startActivity(intent);
            }
        });

        final ImageButton button_arena = findViewById(R.id.buttonarena);
        button_arena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorieMonstres.this, MonsterArenaGuide.class);
                startActivity(intent);
            }
        });

        final ImageButton button_heart = findViewById(R.id.buttonheart);
        button_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorieMonstres.this, fiche_eagle.class);
                startActivity(intent);
            }
        });

        final ImageButton button_food = findViewById(R.id.buttonfood);
        button_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorieMonstres.this, fiche_lightspirit.class);
                startActivity(intent);
            }
        });

        final ImageButton button_elements = findViewById(R.id.buttonelements);
        button_elements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorieMonstres.this, elements.class);
                startActivity(intent);
            }
        });

        final Button button_monstres = findViewById(R.id.buttonmonstres);
        button_monstres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorieMonstres.this, ListChooseMonsters.class);
                startActivity(intent);
            }
        });

    }

}
