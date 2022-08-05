package br.com.myskout.myskout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ParceriasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parcerias_layout);
    }

    //Criando e adicionando o menu na activity parcerias

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Instanciando o menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_parcerias, menu);

        return super.onCreateOptionsMenu(menu);
    }
    //Criando os cliques nos itens de menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mParcAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Alterar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Excluir",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcPesquisar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mParcSair:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Sair",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}