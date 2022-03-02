package com.example.joquempo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaSelecionada) {

        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);


        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp) {
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((opcaoApp == "tesoura" && opcaSelecionada == "papel") ||
                (opcaoApp == "papel" && opcaSelecionada == "pedra") ||
                (opcaoApp == "pedra" && opcaSelecionada == "tesoura"))
        {
            textResultado.setText("Você Perdeu :(");
        }

        else if ((opcaSelecionada == "tesoura" && opcaoApp == "papel") ||
                (opcaSelecionada == "papel" && opcaoApp == "pedra") ||
                (opcaSelecionada == "pedra" && opcaoApp == "tesoura"))
        {
            textResultado.setText("Você Ganhou :) ");
        }


    else {
            textResultado.setText("Empatamos");
        }

    }
}