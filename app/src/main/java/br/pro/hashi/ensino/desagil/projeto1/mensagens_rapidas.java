package br.pro.hashi.ensino.desagil.projeto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.*;
import android.widget.TextView;

public class mensagens_rapidas extends AppCompatActivity {
    LinkedList<String> mensagens_lista = new LinkedList<String>();
    private TextView[] textViews;
    private String M1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagens_rapidas);
        mensagens_lista.add("Estou com fome");
        mensagens_lista.add("Preciso de você");
        mensagens_lista.add("Oi, tudo bom?");
        mensagens_lista.add("Como vão as coisas?");
        mensagens_lista.add("Preciso ir ao banheiro");
        mensagens_lista.add("boa noite, até amanhã");
        mensagens_lista.add("Bom dia");
        String[] array_mensagens = mensagens_lista.toArray(new String[mensagens_lista.size()]);


        public void up () {
            this.mensagens_lista[0] = this.mensagens_lista[1];
            this.mensagens_lista[1] = this.mensagens_lista[2];
            this.mensagens_lista[2] = this.mensagens_lista[3];
            this.mensagens_lista[3] = this.mensagens_lista[4];
            this.mensagens_lista[4] = this.mensagens_lista[5];
            this.mensagens_lista[5] = this.mensagens_lista[6];
            this.mensagens_lista[6] = this.mensagens_lista[0];
        }

            public void up () {
            this.mensagens_lista[0] = this.mensagens_lista[6];
            this.mensagens_lista[1] = this.mensagens_lista[0];
            this.mensagens_lista[2] = this.mensagens_lista[1];
            this.mensagens_lista[3] = this.mensagens_lista[2];
            this.mensagens_lista[4] = this.mensagens_lista[3];
            this.mensagens_lista[5] = this.mensagens_lista[4];
            this.mensagens_lista[6] = this.mensagens_lista[5];
        }



        }

        Button arrow_up = findViewById(R.id.button_up);
        arrow_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                up();
            }
        });

        Button arrow_down = findViewById(R.id.button_down);
        arrow_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                down();
            }
        });


    }
}
