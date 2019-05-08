package br.pro.hashi.ensino.desagil.projeto1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SMS extends AppCompatActivity {

    final TextView text_Message = findViewById(R.id.message);

    // Método de conveniência para mostrar uma bolha de texto.
    private void showToast(String text) {

        // Constrói uma bolha de duração curta.
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);

        // Mostra essa bolha.
        toast.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        EditText textMessage = findViewById(R.id.message);
        EditText textPhone = findViewById(R.id.numero);
        Button buttonSend = findViewById(R.id.button_send);

        buttonSend.setOnClickListener((view) -> {
            String message = textMessage.getText().toString();

            if (message.isEmpty()) {
                showToast("Mensagem inválida!");
                return;
            }

            String phone = textPhone.getText().toString();

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

        text_Message.setText("Mensagem:  " +  mensagem)
    }

}

