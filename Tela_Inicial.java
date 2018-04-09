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
    }

    //Botões
    public void Login(View view){
        startActivity( new Intent(this,Tela_Login.class));
    }

    public void Cadastrar(View view){
        startActivity( new Intent(this,Tela_Cadastro.class));
    }

    public void Sobre(View view){
        startActivity(new Intent (this,Tela_Sobre.class));
    }
}
