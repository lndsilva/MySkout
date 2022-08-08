'package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class RecrutadoresActivity extends AppCompatActivity {
    //Declarando variavel global para carregar a lista
    ListView listaRecrutadores;
    //Base de dados para inserir no ListView

    int imgRecrutadores[] = {
            R.drawable.recrutador,
    };
    String tiluloRecrutadores[] = {"Kleiton José",};
    String cargoRecrutadores[] = {"Gerente de Recursos", "Consultor de recursos humanos",
            "Gestor de recrutamento e seleção", "Assistente de departamento de pessoal",
            "Supervisor de cargos", "Analista de cargos", "Analista de treinamento",
            "Analista de recursos humanos", "Diretor de recursos humanos"};
    String descricaoRecrutadores[] = {"Trabalha no recrutamento de pessoas a mais de 10 anos, é especialista de desenvolvimento de soft skills e hard skils.",
            "Gerencia pessoas e contratação de pessoas",
            "Realiza análise e gestão de processos de recursos humanos",
            "Realiza processos de contratação de pessoas em diversos cargos",
            "Auxiliar na análise de documentação e curriculos",
            "Supervisão dos processos de pessoas","Verifica os cargos e salários",
            "Realiza a criação de treinamento de pessoas e processos."


    };
    String rating[] = {"4,5",};


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
    public class AdaptadorRecr extends BaseAdapter {

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

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {


            return null;
        }
    }
}'