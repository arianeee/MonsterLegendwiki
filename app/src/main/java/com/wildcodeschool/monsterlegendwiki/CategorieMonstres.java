package com.wildcodeschool.monsterlegendwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategorieMonstres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie_monstres);

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
