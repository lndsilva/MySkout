package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class RecrutadoresActivity extends AppCompatActivity {
    //Declarando variavel global para carregar a lista
    ListView listaRecrutadores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recrutadores_layout);

        //Informando o xml para o java
        listaRecrutadores = findViewById(R.id.lstRecrutadores);

        //Instanciando o Adaptador
        AdaptadorRecr adapter = new AdaptadorRecr();

        //estou carregando os itens na lista
        listaRecrutadores.setAdapter(adapter);
    }

    //Criando uma innerclass - Classe dentro da classe
    public class AdaptadorRecr extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        //Que será implementado o modelo da lista
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}