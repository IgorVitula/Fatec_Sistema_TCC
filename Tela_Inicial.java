package com.ntecprograms.samu; //Primeira Tela do Projeto

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela_Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__inicial);
        
        //Referencia dos Botões
        Button TelaLogin =(Button)findViewById(R.id.btnLogin);
        Button AcessarTelaCad =(Button)findViewById(R.id.btnCadastro);
        Button TelaSobre =(Button)findViewById(R.id.btnSobre);
        
        //Botoes Acessando cada Tela
        TelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Tela_Inicial.this,Tela_Login.class));
            }
        });

        AcessarTelaCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Tela_Inicial.this,Tela_Cadastro.class));
            }
        });

        TelaSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Tela_Inicial.this,Tela_Sobre.class));
            }
        });

    }
}
