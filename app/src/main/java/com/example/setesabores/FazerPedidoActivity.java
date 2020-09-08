package com.example.setesabores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FazerPedidoActivity extends AppCompatActivity {

    //João Pedro Pedriali de Araujo - RA 0097894 - Análise e desenvolvimento de sistemas


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazer_pedido);
    }

    //funções vinculadas aos botões
    public void adicionarPedido(View view) {
        TextView pedido = (TextView) findViewById(R.id.txtPedido);
        pedido.setText("Registrando pedido...");
        //TODO Adicionar lógica para realizar pedido
    }

    public void calcularHoras(View view) {
        TextView horas = (TextView) findViewById(R.id.txtHoras);
        horas.setText("Total de horas: ");
        //TODO Adicionar lógica para calcular horas
    }
}
