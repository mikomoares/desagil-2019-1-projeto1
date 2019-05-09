package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.widget.ImageButton;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.*;

public class mensagens_rapidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagens_rapidas);

        final ImageButton pracima = findViewById(R.id.button_up);
        final ImageButton prabaixo = findViewById(R.id.button_down);
        final ImageButton buttonSend = findViewById(R.id.button_send);
        final TextView text_M1 = findViewById(R.id.M1);
        final TextView text_M2 = findViewById(R.id.M2);
        final TextView text_M3 = findViewById(R.id.M3);
        final TextView text_M4 = findViewById(R.id.M4);
        final TextView text_M5 = findViewById(R.id.M5);
        final TextView text_M6 = findViewById(R.id.M6);
        final TextView contato = findViewById(R.id.contato);

        LinkedList<String> lista_mensagens = new LinkedList<>();

        lista_mensagens.add("Estou com fome");
        lista_mensagens.add("Preciso de você");
        lista_mensagens.add("Oi, tudo bom?");
        lista_mensagens.add("Como vão as coisas?");
        lista_mensagens.add("Preciso ir ao banheiro");
        lista_mensagens.add("Outro");


        prabaixo.setOnClickListener((view) -> {
            lista_mensagens.add(lista_mensagens.get(0));
            lista_mensagens.removeFirst();
            text_M1.setText(lista_mensagens.get(0));
            text_M2.setText(lista_mensagens.get(1));
            text_M3.setText(lista_mensagens.get(2));
            text_M4.setText(lista_mensagens.get(3));
            text_M5.setText(lista_mensagens.get(4));
            text_M6.setText(lista_mensagens.get(5));
        });

        pracima.setOnClickListener((view) -> {
            lista_mensagens.add(lista_mensagens.get(0));
            lista_mensagens.add(lista_mensagens.get(1));
            lista_mensagens.add(lista_mensagens.get(2));
            lista_mensagens.add(lista_mensagens.get(3));
            lista_mensagens.add(lista_mensagens.get(4));
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
        });

        String contatinho;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                contatinho = null;
            } else {
                contatinho = extras.getString("key");
            }
        } else {
            contatinho = (String) savedInstanceState.getSerializable("key");
        }

        String numerotele;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                numerotele = null;
            } else {
                numerotele = extras.getString("value");
            }
        } else {
            numerotele = (String) savedInstanceState.getSerializable("value");
        }


        String phone = numerotele;
        String message = lista_mensagens.get(0);
        contato.setText(contatinho);


        buttonSend.setOnClickListener((view) -> {
            if (Objects.equals(lista_mensagens.get(0), "Outro")) {
                Intent intent = new Intent(mensagens_rapidas.this, MorseTranslate.class);
                intent.putExtra("contato", contatinho);
                intent.putExtra("numero_telefone", phone);
                startActivity(intent);

            } else {
                Intent intent = new Intent(mensagens_rapidas.this, SMS.class);
                intent.putExtra("contato", contatinho);
                intent.putExtra("numero_telefone", phone);
                intent.putExtra("mensagem", message);
                startActivity(intent);

            }
        });


    }


}
