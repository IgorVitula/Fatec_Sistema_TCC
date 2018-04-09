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


    public void Login(View view){
       Intent intent = new Intent(this,Tela_Login.class);
        startActivity(intent);
    }

    public void Cadastrar(View view){
        Intent Intent = new Intent(this,Tela_Cadastro.class);
        startActivity(Intent);
    }

    public void Sobre(View view){
        Intent Intent = new Intent(this,Tela_Sobre.class);
        startActivity(Intent);
    }
}
