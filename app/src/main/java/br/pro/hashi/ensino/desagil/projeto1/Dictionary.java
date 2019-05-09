
package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class Dictionary extends AppCompatActivity {

    private Translator translator = new Translator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        ListView listTextToMorse = findViewById(R.id.TextToMorse);
        ListView listMorseToText = findViewById(R.id.MorseToText);

        ArrayList<String> dicTextToMorse = translator.dicCharToMorse();
        ArrayList<String> dicMorseToText = translator.dicMorseToChar();

        Collections.sort(dicTextToMorse);

        ArrayAdapter<String> arrayAdapterTextToMorse = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dicTextToMorse);

        listTextToMorse.setAdapter(arrayAdapterTextToMorse);

        ArrayAdapter<String> arrayAdapterMorseToText = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dicMorseToText);

        listMorseToText.setAdapter(arrayAdapterMorseToText);

        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener((view) -> {
            Intent intent = new Intent(Dictionary.this, MorseTranslate.class);
            startActivity(intent);
        });
    }
}
