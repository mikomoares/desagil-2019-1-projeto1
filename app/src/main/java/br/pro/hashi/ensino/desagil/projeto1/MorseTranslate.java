package br.edu.insper.al.andreew.testeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.pro.hashi.ensino.desagil.projeto1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button ButtonSignal = findViewById(R.id.button_signal);
        final TextView textview = findViewById(R.id.TextView);
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
