package br.pro.hashi.ensino.desagil.projeto1;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private int contactsIdx = 0;

    public HashMap<String, String> contacts = new HashMap<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView contact1 = findViewById(R.id.c0);
        contact1.setText("Andre");
        contacts.put("Andre", "+5511994760134");





        TextView contact2 = findViewById(R.id.c1);
        contact2.setText("Cuidador");
        contacts.put("Cuidador", "+5511974747877");




        TextView contact3 = findViewById(R.id.c2);
        contact3.setText("Michel");
        contacts.put("Michel", "+5511996324270");



        TextView contact4 = findViewById(R.id.c3);
        contact4.setText("Evandro");
        contacts.put("Evandro", "+554197522899");



        TextView contact5 = findViewById(R.id.c4);
        contact5.setText("Mae");
        contacts.put("Mae", "+5511995788182");



        TextView contact6 = findViewById(R.id.c5);
        contact6.setText("Pai");
        contacts.put("Pai", "+5511991900988");



        TextView contact7 = findViewById(R.id.c6);
        contact7.setText("OUTRO");
        contacts.put("Outro", "");






        ImageButton btnDown = findViewById(R.id.down);
        btnDown.setOnClickListener((view) -> {

            String idText = "c" + (contactsIdx);
            int resourceId = getResources().getIdentifier(idText, "id",
                    getPackageName());

            if (contactsIdx < contacts.size() - 1) {
                findViewById(resourceId).setBackgroundResource(R.drawable.textview_noborder);
                findViewById(resourceId + 1).setBackgroundResource(R.drawable.textview_border);
                contactsIdx += 1;


            }


        });

        ImageButton btnUp = findViewById(R.id.up);
        btnUp.setOnClickListener((view) -> {

            String idText = "c" + (contactsIdx);
            int resourceId = getResources().getIdentifier(idText, "id",
                    getPackageName());

            if (contactsIdx > 0) {
                findViewById(resourceId).setBackgroundResource(R.drawable.textview_noborder);
                findViewById(resourceId - 1).setBackgroundResource(R.drawable.textview_border);
                contactsIdx -= 1;


            }

        });

        ImageButton btnSelect = findViewById(R.id.select);
        btnSelect.setOnClickListener((view) -> {

            String idText = "c" + (contactsIdx);
            int resourceId = getResources().getIdentifier(idText, "id",
                    getPackageName());

            TextView textBox = findViewById(resourceId);

            String key = textBox.getText().toString();

            Intent intent = new Intent(MainActivity.this, mensagens_rapidas.class);
            intent.putExtra("value", contacts.get(key));
            intent.putExtra("key", key);
            startActivity(intent);
        });
    }
}
