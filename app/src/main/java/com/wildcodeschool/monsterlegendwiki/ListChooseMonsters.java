package com.wildcodeschool.monsterlegendwiki;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ListChooseMonsters extends AppCompatActivity {

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
}
}
