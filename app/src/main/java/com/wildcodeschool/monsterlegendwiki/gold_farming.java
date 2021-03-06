package com.wildcodeschool.monsterlegendwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class gold_farming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_farming);

        final ImageButton button_gold = findViewById(R.id.imagegoldmenu);
        button_gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gold_farming.this, gold_farming.class);
                startActivity(intent);
            }
        });

        final ImageButton button_arena = findViewById(R.id.imagearenamenu);
        button_arena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gold_farming.this, MonsterArenaGuide.class);
                startActivity(intent);
            }
        });

        final ImageButton button_heart = findViewById(R.id.imageheartmenu);
        button_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gold_farming.this, breeding_epic.class);
                startActivity(intent);
            }
        });

        final ImageButton button_tomato = findViewById(R.id.imagetomatomenu);
        button_tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gold_farming.this, Food.class);
                startActivity(intent);
            }
        });

        final ImageButton button_elements = findViewById(R.id.imageelementmenu);
        button_elements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gold_farming.this, elements.class);
                startActivity(intent);
            }
        });

    }
}
