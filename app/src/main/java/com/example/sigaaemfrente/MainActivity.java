package com.example.sigaaemfrente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonInicial;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent abrirJogo = new Intent(MainActivity.this, Jogo.class);


        buttonInicial = findViewById(R.id.buttonJogar);

        buttonInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(abrirJogo);
            }
        });
    }
}