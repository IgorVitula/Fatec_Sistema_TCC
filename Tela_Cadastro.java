package com.ntecprograms.samu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Tela_Cadastro extends AppCompatActivity {
    public String sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__cadastro);

        final EditText Nome =(EditText)findViewById(R.id.edtNome);
        final EditText Idade=(EditText)findViewById(R.id.edtIdade);
        final EditText Cpf =(EditText)findViewById(R.id.edtCpf);
        final EditText Rg =(EditText)findViewById(R.id.edtRg);
        final EditText DataNasc =(EditText)findViewById(R.id.edtData);

        Button ProximaPagina =(Button)findViewById(R.id.btnProximaUm);

        final RadioButton Masc =(RadioButton)findViewById(R.id.rbMasculino);
        final RadioButton Fem =(RadioButton)findViewById(R.id.rbFeminino);

        RadioGroup RadioGroupSexo =(RadioGroup)findViewById(R.id.radioGrupoSexo);
        final FichaPaciente fp = new FichaPaciente();


        //Validação RadioGroup
        RadioGroupSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (Masc.isChecked()){
                   fp.setSexo("Masculino");
                }
                if(Fem.isChecked()){
                   fp.setSexo("Feminino");
                }
            }
        });


        //Botão Proxima pagina cadastro
        ProximaPagina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Nome.getText().length() == 0 ||Idade.getText().length() == 0 || Cpf.getText().length()== 0 ||
                        Rg.getText().length() == 0 || DataNasc.getText().length() == 0) {

                    Nome.setError("Campo Requirido");
                    Idade.setError("Campo Requirido");
                    Cpf.setError("Campo Requirido");
                    Rg.setError("Campo Requirido");
                    DataNasc.setError("Campo Requirido");

                }
                else{
                      startActivity(new Intent(Tela_Cadastro.this,Tela_CadastroDois.class));
                    fp.setNome(Nome.getText().toString());
                    fp.setIdade(Integer.parseInt(Idade.getText().toString()));
                    fp.setRg(Integer.parseInt(Rg.getText().toString()));
                    fp.setCpf(Integer.parseInt(Cpf.getText().toString()));
                    fp.setDataNasc(DataNasc.getText().toString());
                }

            }
        });

    }
}
