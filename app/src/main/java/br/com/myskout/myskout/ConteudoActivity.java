package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ConteudoActivity extends AppCompatActivity {
    //Declarando variável global para o componente
    BottomNavigationView bottomNavigationView;

    //Instanciar todos os fragments que serão utilizados neste layout
    TalentosFragment talentosFragment = new TalentosFragment();
    VagasFragment vagasFragment = new VagasFragment();
    RecrutadoresFragment recrutadoresFragment = new RecrutadoresFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conteudo_layout);

        bottomNavigationView = findViewById(R.id.idBottomNavView);

        

    }
}