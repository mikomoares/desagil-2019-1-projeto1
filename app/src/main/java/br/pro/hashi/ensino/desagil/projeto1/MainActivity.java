package br.pro.hashi.ensino.desagil.projeto1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_SEND_SMS = 0;

    private int contactsIdx = 0;

    private final HashMap<String, String> contacts = new HashMap<>();


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
        contacts.put("Evandro", "+5541997522899");


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

            // Verifica se o aplicativo tem a permissão desejada.
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {

                // Se tem, podemos iniciar a SMSActivity direto.
                String idText = "c" + (contactsIdx);
                int resourceId = getResources().getIdentifier(idText, "id",
                        getPackageName());

                TextView textBox = findViewById(resourceId);

                String key = textBox.getText().toString();

                Intent intent = new Intent(MainActivity.this, mensagens_rapidas.class);
                intent.putExtra("value", contacts.get(key));
                intent.putExtra("key", key);
                startActivity(intent);
            } else {

                // Senão, precisamos pedir essa permissão.

                // Cria um vetor de permissões a pedir. Como queremos
                // uma só, parece um pouco feio, mas é bem conveniente
                // quando queremos pedir várias permissões de uma vez.
                String[] permissions = new String[]{
                        Manifest.permission.SEND_SMS,
                };

                ActivityCompat.requestPermissions(this, permissions, REQUEST_SEND_SMS);
            }


        });
    }
}
