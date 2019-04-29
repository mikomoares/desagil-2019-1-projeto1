package br.pro.hashi.ensino.desagil.projeto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import br.pro.hashi.ensino.desagil.projeto1.R;

public class MorseTranslate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse_translate);


        final ImageButton ButtonSignal = findViewById(R.id.button_signal);
        final TextView textview = findViewById(R.id.morse_text);
        ButtonSignal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                char letter = '.';
                String string = String.valueOf(letter);
                textview.append(string);


            }
        });

    }
}
