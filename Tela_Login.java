package com.ntecprograms.samu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__login);
        //Referencias ao Botões e EditTexts do Login, senha e Cpf
        Button Logar =(Button)findViewById(R.id.btnLogar);
        final EditText Login =(EditText)findViewById(R.id.edtLogin);
        final EditText Senha =(EditText)findViewById(R.id.edtSenha);
        final EditText CpfLogin =(EditText)findViewById(R.id.edtCpfLogin);

        //Validação de campos
        Logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Login.getText().length()==0 || Senha.getText().length()==0 || CpfLogin.getText().length() ==0){
                    Login.setError("Campo Requirido");
                    Senha.setError("Campo Requirido");
                    CpfLogin.setError("Campo Requirido");
                }
            }
        });
    }
}
