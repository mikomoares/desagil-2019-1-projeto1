package br.pro.hashi.ensino.desagil.projeto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.*;

public class mensagens_rapidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagens_rapidas);

        final ImageButton pracima = findViewById(R.id.button_up);
        final ImageButton prabaixo = findViewById(R.id.button_down);
        final TextView text_M1 = findViewById(R.id.M1);
        final TextView text_M2 = findViewById(R.id.M2);
        final TextView text_M3 = findViewById(R.id.M3);
        final TextView text_M4 = findViewById(R.id.M4);
        final TextView text_M5 = findViewById(R.id.M5);
        final TextView text_M6 = findViewById(R.id.M6);
        final TextView text_M7 = findViewById(R.id.M7);
        LinkedList<String> lista_mensagens = new LinkedList<String>();

        lista_mensagens.add("Estou com fome");
        lista_mensagens.add("Preciso de você");
        lista_mensagens.add("Oi, tudo bom?");
        lista_mensagens.add("Como vão as coisas?");
        lista_mensagens.add("Preciso ir ao banheiro");
        lista_mensagens.add("boa noite, até amanhã");
        lista_mensagens.add("Bom dia");




        pracima.setOnClickListener((view) -> {
            lista_mensagens.add(lista_mensagens.get(0));
            lista_mensagens.removeFirst();
            text_M1.setText(lista_mensagens.get(0));
            text_M2.setText(lista_mensagens.get(1));
            text_M3.setText(lista_mensagens.get(2));
            text_M4.setText(lista_mensagens.get(3));
            text_M5.setText(lista_mensagens.get(4));
            text_M6.setText(lista_mensagens.get(5));
            text_M7.setText(lista_mensagens.get(6));
        });

            prabaixo.setOnClickListener((view) -> {
                lista_mensagens.add(lista_mensagens.get(0));
                lista_mensagens.add(lista_mensagens.get(1));
                lista_mensagens.add(lista_mensagens.get(2));
                lista_mensagens.add(lista_mensagens.get(3));
                lista_mensagens.add(lista_mensagens.get(4));
                lista_mensagens.add(lista_mensagens.get(5));
                lista_mensagens.removeFirst();
                lista_mensagens.removeFirst();
                lista_mensagens.removeFirst();
                lista_mensagens.removeFirst();
                lista_mensagens.removeFirst();
                lista_mensagens.removeFirst();
                text_M1.setText(lista_mensagens.get(0));
                text_M2.setText(lista_mensagens.get(1));
                text_M3.setText(lista_mensagens.get(2));
                text_M4.setText(lista_mensagens.get(3));
                text_M5.setText(lista_mensagens.get(4));
                text_M6.setText(lista_mensagens.get(5));
                text_M7.setText(lista_mensagens.get(6));
        });


    }
}
