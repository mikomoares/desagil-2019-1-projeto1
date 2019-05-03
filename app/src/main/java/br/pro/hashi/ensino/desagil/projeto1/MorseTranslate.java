package br.pro.hashi.ensino.desagil.projeto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.LinkedList;

public class MorseTranslate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse_translate);

        final Translator translator = new Translator();
        final ImageButton buttonBack = findViewById(R.id.backspace);
        final ImageButton buttonSignal = findViewById(R.id.button_signal);
        final TextView textmorse = findViewById(R.id.morse_text);
        final Button buttonSpace = findViewById(R.id.whitespace);
        final TextView texttrad = findViewById(R.id.translated_text);
        LinkedList<String> lista = translator.getCodes();
        System.out.println(lista);

        buttonSignal.setOnLongClickListener((view) -> {
            if (textmorse.getText().length()<5) {
                textmorse.setText(textmorse.getText() + "-");
            }
            return true;
        });

        buttonSignal.setOnClickListener((view) -> {
            if (textmorse.getText().length()<5) {
                textmorse.setText(textmorse.getText() + ".");
            }
        });

        buttonSpace.setOnClickListener((view) -> {
            //if (lista.contains(textmorse.toString())) {
                texttrad.setText(texttrad.getText().toString() + translator.morseToChar(textmorse.getText().toString()));
                textmorse.setText("");
           // }
        });

        buttonBack.setOnClickListener((view) -> {
            String morse = textmorse.getText().toString();
            String alpha = texttrad.getText().toString();
            int tamanhom = morse.length();
            int tamanhoa = alpha.length();
            if (tamanhom != 0) {
                String novo = morse.substring(0, tamanhom - 1);
                textmorse.setText(novo);
            } else if (tamanhoa != 0){
                String novo = alpha.substring(0, tamanhoa - 1);
                texttrad.setText(novo);
            } else{
                texttrad.setText("");
            }
        });
    }
}