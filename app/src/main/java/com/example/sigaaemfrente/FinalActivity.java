package com.example.sigaaemfrente;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class FinalActivity extends AppCompatActivity {

    int[] IP = new int[4];
    int[] IPMaior = new int[4];

    int IPAuxiliarUm;
    int IPAuxiliarDois;

    private TextView[] texts = new TextView[4];

    private ImageView[] images = new ImageView[4];

    private TextView[] textsIP = new TextView[4];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        IP[0] = getIntent().getIntExtra("IPUm", 0);
        IP[1] = getIntent().getIntExtra("IPDois", 0);
        IP[2] = getIntent().getIntExtra("IPTres", 0);
        IP[3] = getIntent().getIntExtra("IPQuatro", 0);

        texts[0] = findViewById(R.id.textPrimeiro);
        texts[1] = findViewById(R.id.textSegundo);
        texts[2] = findViewById(R.id.textTerceiro);
        texts[3] = findViewById(R.id.textQuarto);

        images[0] = findViewById(R.id.imagePrimeiro);
        images[1] = findViewById(R.id.imageSegundo);
        images[2] = findViewById(R.id.imageTerceiro);
        images[3] = findViewById(R.id.imageQuarto);

        textsIP[0] = findViewById(R.id.textIPPrimeiro);
        textsIP[1] = findViewById(R.id.textIPSegundo);
        textsIP[2] = findViewById(R.id.textIPTerceiro);
        textsIP[3] = findViewById(R.id.textIPQuarto);



        for (IPAuxiliarUm = 0; IPAuxiliarUm < 4; IPAuxiliarUm++) {
            IPMaior[IPAuxiliarUm] = 0;
        }

        for(IPAuxiliarUm = 0; IPAuxiliarUm < 3; IPAuxiliarUm++){
            for(IPAuxiliarDois = 0; IPAuxiliarDois < 4; IPAuxiliarDois++){
                if(IPAuxiliarDois > IPAuxiliarUm){
                    if(IP[IPAuxiliarUm] >= IP[IPAuxiliarDois]){
                        IPMaior[IPAuxiliarUm]++;
                    } else {
                        IPMaior[IPAuxiliarDois]++;
                    }
                }
            }
        }

        for(IPAuxiliarUm = 0; IPAuxiliarUm < 4; IPAuxiliarUm++){
            switch (IPMaior[IPAuxiliarUm]) {
                case 3:
                    switch (IPAuxiliarUm) {
                        case 0:
                            texts[0].setText("1º - Pino Azul");
                            images[0].setImageResource(R.mipmap.pino_um_foreground);
                            textsIP[0].setText("IP: " + IP[0]);
                            break;

                        case 1:
                            texts[0].setText("1º - Pino Vermelho");
                            images[0].setImageResource(R.mipmap.pino_dois_foreground);
                            textsIP[0].setText("IP: " + IP[1]);
                            break;

                        case 2:
                            texts[0].setText("1º - Pino Verde");
                            images[0].setImageResource(R.mipmap.pino_tres_foreground);
                            textsIP[0].setText("IP: " + IP[2]);
                            break;

                        case 3:
                            texts[0].setText("1º - Pino Amarelo");
                            images[0].setImageResource(R.mipmap.pino_quatro_foreground);
                            textsIP[0].setText("IP: " + IP[3]);
                            break;
                    }
                    break;

                case 2:
                    switch (IPAuxiliarUm) {
                        case 0:
                            texts[1].setText("2º - Pino Azul");
                            images[1].setImageResource(R.mipmap.pino_um_foreground);
                            textsIP[1].setText("IP: " + IP[0]);
                            break;

                        case 1:
                            texts[1].setText("2º - Pino Vermelho");
                            images[1].setImageResource(R.mipmap.pino_dois_foreground);
                            textsIP[1].setText("IP: " + IP[1]);
                            break;

                        case 2:
                            texts[1].setText("2º - Pino Verde");
                            images[1].setImageResource(R.mipmap.pino_tres_foreground);
                            textsIP[1].setText("IP: " + IP[2]);
                            break;

                        case 3:
                            texts[1].setText("2º - Pino Amarelo");
                            images[1].setImageResource(R.mipmap.pino_quatro_foreground);
                            textsIP[1].setText("IP: " + IP[3]);
                            break;
                    }
                    break;

                case 1:
                    switch (IPAuxiliarUm) {
                        case 0:
                            texts[2].setText("3º - Pino Azul");
                            images[2].setImageResource(R.mipmap.pino_um_foreground);
                            textsIP[2].setText("IP: " + IP[0]);
                            break;

                        case 1:
                            texts[2].setText("3º - Pino Vermelho");
                            images[2].setImageResource(R.mipmap.pino_dois_foreground);
                            textsIP[2].setText("IP: " + IP[1]);
                            break;

                        case 2:
                            texts[2].setText("3º - Pino Verde");
                            images[2].setImageResource(R.mipmap.pino_tres_foreground);
                            textsIP[2].setText("IP: " + IP[2]);
                            break;

                        case 3:
                            texts[2].setText("3º - Pino Amarelo");
                            images[2].setImageResource(R.mipmap.pino_quatro_foreground);
                            textsIP[2].setText("IP: " + IP[3]);
                            break;
                    }
                    break;

                case 0:
                    switch (IPAuxiliarUm) {
                        case 0:
                            texts[3].setText("4º - Pino Azul");
                            images[3].setImageResource(R.mipmap.pino_um_foreground);
                            textsIP[3].setText("IP: " + IP[0]);
                            break;

                        case 1:
                            texts[3].setText("4º - Pino Vermelho");
                            images[3].setImageResource(R.mipmap.pino_dois_foreground);
                            textsIP[3].setText("IP: " + IP[1]);
                            break;

                        case 2:
                            texts[3].setText("4º - Pino Verde");
                            images[3].setImageResource(R.mipmap.pino_tres_foreground);
                            textsIP[3].setText("IP: " + IP[2]);
                            break;

                        case 3:
                            texts[3].setText("4º - Pino Amarelo");
                            images[3].setImageResource(R.mipmap.pino_quatro_foreground);
                            textsIP[3].setText("IP: " + IP[3]);
                            break;
                    }
                    break;
            }
        }
    }
}
