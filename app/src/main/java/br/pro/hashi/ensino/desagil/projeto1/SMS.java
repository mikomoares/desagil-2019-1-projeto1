package br.pro.hashi.ensino.desagil.projeto1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SMS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        ImageButton buttonSend = findViewById(R.id.send2);

        TextView text_Message = findViewById(R.id.message);
        TextView text_Number = findViewById(R.id.numero);
        TextView text_Contact = findViewById(R.id.contato);

        buttonSend.setOnClickListener((view) -> {
            String message = text_Message.getText().toString();

            if (message.isEmpty()) {
                showToast("Mensagem inválida!");
                return;
            }


            String phone = String.valueOf(text_Number.getText());
            Log.d("DEBUG/2", phone);
            // Esta verificação do número de telefone é bem
            // rígida, pois exige até mesmo o código do país.
            if (!PhoneNumberUtils.isGlobalPhoneNumber(phone)) {
                showToast("Número inválido!");
                return;
            }

            // Enviar uma mensagem de SMS. Por simplicidade,
            // não estou verificando se foi mesmo enviada,
            // mas é possível fazer uma versão que verifica.
            SmsManager manager = SmsManager.getDefault();
            manager.sendTextMessage(phone, null, message, null, null);

        });
        String mensagem;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                mensagem = null;
            } else {
                mensagem = extras.getString("mensagem");
            }
        } else {
            mensagem = (String) savedInstanceState.getSerializable("mensagem");
        }

        String numero_telefone;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                numero_telefone = null;
            } else {
                numero_telefone = extras.getString("numero_telefone");
            }
        } else {
            numero_telefone = (String) savedInstanceState.getSerializable("numero_telefone");
        }

        String contato;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                contato = null;
            } else {
                contato = extras.getString("contato");
            }
        } else {
            contato = (String) savedInstanceState.getSerializable("contato");
        }
        if (mensagem==null)
            text_Message.setText("Mensagem:  " +  " ");
        else
            text_Message.setText("Mensagem:  " +  mensagem);

        if (numero_telefone==null)
            text_Number.setText(" ");
        else
            Log.d("DEBUG/",numero_telefone);
            text_Number.setText(numero_telefone);

        if (contato==null)
            text_Contact.setText("Contato: " + " ");
        else
            text_Contact.setText("Contato: " + contato);



    }

    // Function to insert string
    public static String insertString(
            String originalString,
            String stringToBeInserted,
            int index)
    {

        // Create a new string
        String newString = new String();

        for (int i = 0; i < originalString.length(); i++) {

            // Insert the original string character
            // into the new string
            newString += originalString.charAt(i);

            if (i == index) {

                // Insert the string to be inserted
                // into the new string
                newString += stringToBeInserted;
            }
        }

        // return the modified String
        return newString;
    }

    // Método de conveniência para mostrar uma bolha de texto.
    private void showToast(String text) {

        // Constrói uma bolha de duração curta.
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        // Mostra essa bolha.
        toast.show();
    }

}

