package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class RecrutadoresActivity extends AppCompatActivity {
    //Declarando variavel global para carregar a lista
    ListView listaRecrutares;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recrutadores_layout);

        //Informando o xml para o java
        listaRecrutares = findViewById(R.id.lstRecrutadores);

        //Instanciando o Adaptador

        //estou carregando os itens na lista
        listaRecrutares.setAdapter();
    }
}