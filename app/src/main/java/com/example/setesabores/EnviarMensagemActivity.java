package com.example.setesabores;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EnviarMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_mensagem);
    }

    public void onEnviarMensagem(View view) {
        EditText mensagem = (EditText) findViewById(R.id.txtMsgToSend);


        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, mensagem.getText());
        intent.setType("text/plain");
        startActivity(intent);
    }
}
