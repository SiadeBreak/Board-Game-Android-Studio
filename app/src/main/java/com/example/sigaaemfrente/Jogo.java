package com.example.sigaaemfrente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;



class functionDado {
    public static int rollDado() {
        Random numeroDado = new Random();
        return numeroDado.nextInt(6) + 1;
    }
}

class functionRandomCarta {
    public static int rollCarta() {
        Random numeroCarta = new Random();
        return numeroCarta.nextInt(31);
    }
}

public class Jogo extends AppCompatActivity {

    private ImageView buttonDado;
    private TextView buttonCarta;
    private boolean[] ganhou = new boolean[4];

    private ImageView imagemPinoUm;
    private ImageView imagemPinoDois;
    private ImageView imagemPinoTres;
    private ImageView imagemPinoQuatro;

    private ConstraintLayout layoutCartaAnimation;
    private TextView cartaAnimation;

    private ImageView buttonAbrirRanking;
    private ImageView buttonFecharRanking;
    private LinearLayout layoutRanking;
    private boolean layoutRankingAberto = false;

    private ConstraintLayout layoutRankingTwoImage;
    private ConstraintLayout layoutRankingThreeImage;
    private ConstraintLayout layoutRankingFourImage;
    private ConstraintLayout layoutRankingFiveImage;

    private ImageView imagemRankingPinoUm;
    private ImageView imagemRankingPinoDois;
    private ImageView imagemRankingPinoTres;
    private ImageView imagemRankingPinoQuatro;

    private TextView layoutRankingTwoText;
    private TextView layoutRankingThreeText;
    private TextView layoutRankingFourText;
    private TextView layoutRankingFiveText;

    private ImageView[] pinosRanking;

    private Animation shineAnimation;
    private Animation scaleRotateAnimation;



    int[] layoutGroupCasasUm = {
            R.id.layoutPinoUm, R.id.layoutLeftTwoSixA, R.id.layoutLeftTwoFiveA,
            R.id.layoutLeftTwoFourA, R.id.layoutLeftTwoThreeA, R.id.layoutLeftTwoTwoA,
            R.id.layoutLeftThreeTwoA, R.id.layoutLeftFourTwoA, R.id.layoutLeftFourThreeA,
            R.id.layoutLeftFourFourA, R.id.layoutLeftFourFiveA, R.id.layoutLeftFiveFiveA,
            R.id.layoutLeftSixFiveA, R.id.layoutLeftSixFourA, R.id.layoutLeftSixThreeA,
            R.id.layoutLeftSixTwoA, R.id.layoutLeftSevenTwoA, R.id.layoutLeftEightTwoA,
            R.id.layoutLeftEightThreeA, R.id.layoutLeftEightFourA, R.id.layoutLeftEightFiveA,
            R.id.layoutLeftEightSixA, R.id.layoutMeioEightA, R.id.layoutRightEightOneA,
            R.id.layoutRightEightTwoA, R.id.layoutRightEightThreeA, R.id.layoutRightEightFourA,
            R.id.layoutRightEightFiveA, R.id.layoutRightSevenFiveA, R.id.layoutRightSixFiveA,
            R.id.layoutRightSixFourA, R.id.layoutRightSixThreeA, R.id.layoutRightSixTwoA,
            R.id.layoutRightFiveTwoA, R.id.layoutRightFourTwoA, R.id.layoutRightFourThreeA,
            R.id.layoutRightFourFourA, R.id.layoutRightFourFiveA, R.id.layoutRightThreeFiveA,
            R.id.layoutRightTwoFiveA, R.id.layoutRightTwoFourA, R.id.layoutRightTwoThreeA,
            R.id.layoutRightTwoTwoA, R.id.layoutRightTwoOneA
    };

    int[] layoutGroupCasasDois = {
            R.id.layoutPinoDois, R.id.layoutLeftTwoSixB, R.id.layoutLeftTwoFiveB,
            R.id.layoutLeftTwoFourB, R.id.layoutLeftTwoThreeB, R.id.layoutLeftTwoTwoB,
            R.id.layoutLeftThreeTwoB, R.id.layoutLeftFourTwoB, R.id.layoutLeftFourThreeB,
            R.id.layoutLeftFourFourB, R.id.layoutLeftFourFiveB, R.id.layoutLeftFiveFiveB,
            R.id.layoutLeftSixFiveB, R.id.layoutLeftSixFourB, R.id.layoutLeftSixThreeB,
            R.id.layoutLeftSixTwoB, R.id.layoutLeftSevenTwoB, R.id.layoutLeftEightTwoB,
            R.id.layoutLeftEightThreeB, R.id.layoutLeftEightFourB, R.id.layoutLeftEightFiveB,
            R.id.layoutLeftEightSixB, R.id.layoutMeioEightB, R.id.layoutRightEightOneB,
            R.id.layoutRightEightTwoB, R.id.layoutRightEightThreeB, R.id.layoutRightEightFourB,
            R.id.layoutRightEightFiveB, R.id.layoutRightSevenFiveB, R.id.layoutRightSixFiveB,
            R.id.layoutRightSixFourB, R.id.layoutRightSixThreeB, R.id.layoutRightSixTwoB,
            R.id.layoutRightFiveTwoB, R.id.layoutRightFourTwoB, R.id.layoutRightFourThreeB,
            R.id.layoutRightFourFourB, R.id.layoutRightFourFiveB, R.id.layoutRightThreeFiveB,
            R.id.layoutRightTwoFiveB, R.id.layoutRightTwoFourB, R.id.layoutRightTwoThreeB,
            R.id.layoutRightTwoTwoB, R.id.layoutRightTwoOneB
    };

    int[] layoutGroupCasasTres = {
            R.id.layoutPinoTres, R.id.layoutLeftTwoSixC, R.id.layoutLeftTwoFiveC,
            R.id.layoutLeftTwoFourC, R.id.layoutLeftTwoThreeC, R.id.layoutLeftTwoTwoC,
            R.id.layoutLeftThreeTwoC, R.id.layoutLeftFourTwoC, R.id.layoutLeftFourThreeC,
            R.id.layoutLeftFourFourC, R.id.layoutLeftFourFiveC, R.id.layoutLeftFiveFiveC,
            R.id.layoutLeftSixFiveC, R.id.layoutLeftSixFourC, R.id.layoutLeftSixThreeC,
            R.id.layoutLeftSixTwoC, R.id.layoutLeftSevenTwoC, R.id.layoutLeftEightTwoC,
            R.id.layoutLeftEightThreeC, R.id.layoutLeftEightFourC, R.id.layoutLeftEightFiveC,
            R.id.layoutLeftEightSixC, R.id.layoutMeioEightC, R.id.layoutRightEightOneC,
            R.id.layoutRightEightTwoC, R.id.layoutRightEightThreeC, R.id.layoutRightEightFourC,
            R.id.layoutRightEightFiveC, R.id.layoutRightSevenFiveC, R.id.layoutRightSixFiveC,
            R.id.layoutRightSixFourC, R.id.layoutRightSixThreeC, R.id.layoutRightSixTwoC,
            R.id.layoutRightFiveTwoC, R.id.layoutRightFourTwoC, R.id.layoutRightFourThreeC,
            R.id.layoutRightFourFourC, R.id.layoutRightFourFiveC, R.id.layoutRightThreeFiveC,
            R.id.layoutRightTwoFiveC, R.id.layoutRightTwoFourC, R.id.layoutRightTwoThreeC,
            R.id.layoutRightTwoTwoC, R.id.layoutRightTwoOneC
    };

    int[] layoutGroupCasasQuatro = {
            R.id.layoutPinoQuatro, R.id.layoutLeftTwoSixD, R.id.layoutLeftTwoFiveD,
            R.id.layoutLeftTwoFourD, R.id.layoutLeftTwoThreeD, R.id.layoutLeftTwoTwoD,
            R.id.layoutLeftThreeTwoD, R.id.layoutLeftFourTwoD, R.id.layoutLeftFourThreeD,
            R.id.layoutLeftFourFourD, R.id.layoutLeftFourFiveD, R.id.layoutLeftFiveFiveD,
            R.id.layoutLeftSixFiveD, R.id.layoutLeftSixFourD, R.id.layoutLeftSixThreeD,
            R.id.layoutLeftSixTwoD, R.id.layoutLeftSevenTwoD, R.id.layoutLeftEightTwoD,
            R.id.layoutLeftEightThreeD, R.id.layoutLeftEightFourD, R.id.layoutLeftEightFiveD,
            R.id.layoutLeftEightSixD, R.id.layoutMeioEightD, R.id.layoutRightEightOneD,
            R.id.layoutRightEightTwoD, R.id.layoutRightEightThreeD, R.id.layoutRightEightFourD,
            R.id.layoutRightEightFiveD, R.id.layoutRightSevenFiveD, R.id.layoutRightSixFiveD,
            R.id.layoutRightSixFourD, R.id.layoutRightSixThreeD, R.id.layoutRightSixTwoD,
            R.id.layoutRightFiveTwoD, R.id.layoutRightFourTwoD, R.id.layoutRightFourThreeD,
            R.id.layoutRightFourFourD, R.id.layoutRightFourFiveD, R.id.layoutRightThreeFiveD,
            R.id.layoutRightTwoFiveD, R.id.layoutRightTwoFourD, R.id.layoutRightTwoThreeD,
            R.id.layoutRightTwoTwoD, R.id.layoutRightTwoOneD
    };



    int valorDado;
    int valorCarta;
    int numeroJogador = 0;

    int[] IP = new int[4];
    int[] IPMaior = new int[4];
    int IPAuxiliarUm;
    int IPAuxiliarDois;

    int positionAtualPino1 = 0;
    int positionAtualPino2 = 0;
    int positionAtualPino3 = 0;
    int positionAtualPino4 = 0;

    int layoutInicialID;
    int layoutFinalID;

    int[] coordenadasInicial = new int[2];
    int coordenadasInicialX;
    int coordenadasInicialY;

    int[] coordenadasFinal = new int[2];
    int coordenadasFinalX;
    int coordenadasFinalY;

    float deltaX;
    float deltaY;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogo_background);

        buttonDado = findViewById(R.id.imagemDado);
        buttonCarta = findViewById(R.id.textCarta);

        imagemPinoUm = findViewById(R.id.imagemPinoUm);
        imagemPinoDois = findViewById(R.id.imagemPinoDois);
        imagemPinoTres = findViewById(R.id.imagemPinoTres);
        imagemPinoQuatro = findViewById(R.id.imagemPinoQuatro);

        layoutCartaAnimation = findViewById(R.id.layoutCartaAnimation);
        cartaAnimation = findViewById(R.id.cartaAnimation);

        layoutRanking = findViewById(R.id.layoutRanking);
        buttonAbrirRanking = findViewById(R.id.buttonAbrirRanking);
        buttonFecharRanking = findViewById(R.id.buttonFecharRanking);

        shineAnimation = AnimationUtils.loadAnimation(this, R.anim.shine);
        scaleRotateAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_rotate);

        for(IPAuxiliarUm = 0; IPAuxiliarUm < 4; IPAuxiliarUm++){
            IP[IPAuxiliarUm] = 0;
        }



        buttonDado.startAnimation(shineAnimation);



        buttonDado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarJogada();
            }
        });



        buttonAbrirRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLayoutRanking();
            }
        });

        buttonFecharRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fecharLayoutRanking();

                if(ganhou[0] && ganhou[1] && ganhou[2] && ganhou[3]){
                    Intent terminarJogo = new Intent(Jogo.this, FinalActivity.class);

                    terminarJogo.putExtra("IPUm", IP[0]);
                    terminarJogo.putExtra("IPDois", IP[1]);
                    terminarJogo.putExtra("IPTres", IP[2]);
                    terminarJogo.putExtra("IPQuatro", IP[3]);

                    startActivity(terminarJogo);
                }
            }
        });
    }

    private void atualizarRanking(){
        layoutRankingTwoImage = findViewById(R.id.layoutRankingTwoImage);
        layoutRankingThreeImage = findViewById(R.id.layoutRankingThreeImage);
        layoutRankingFourImage = findViewById(R.id.layoutRankingFourImage);
        layoutRankingFiveImage = findViewById(R.id.layoutRankingFiveImage);

        imagemRankingPinoUm = findViewById(R.id.imagemRankingPinoUm);
        imagemRankingPinoDois = findViewById(R.id.imagemRankingPinoDois);
        imagemRankingPinoTres = findViewById(R.id.imagemRankingPinoTres);
        imagemRankingPinoQuatro = findViewById(R.id.imagemRankingPinoQuatro);

        layoutRankingTwoText = findViewById(R.id.layoutRankingTwoText);
        layoutRankingThreeText = findViewById(R.id.layoutRankingThreeText);
        layoutRankingFourText = findViewById(R.id.layoutRankingFourText);
        layoutRankingFiveText = findViewById(R.id.layoutRankingFiveText);

        pinosRanking = new ImageView[]{imagemRankingPinoUm, imagemRankingPinoDois, imagemRankingPinoTres, imagemRankingPinoQuatro};

        layoutRankingTwoImage.removeAllViews();
        layoutRankingThreeImage.removeAllViews();
        layoutRankingFourImage.removeAllViews();
        layoutRankingFiveImage.removeAllViews();

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
            ImageView imageView = pinosRanking[IPAuxiliarUm];

            switch (IPMaior[IPAuxiliarUm]) {
                case 3:
                    layoutRankingTwoImage.addView(imageView);
                    layoutRankingTwoText.setText("IP: " + IP[IPAuxiliarUm]);
                    break;
                case 2:
                    layoutRankingThreeImage.addView(imageView);
                    layoutRankingThreeText.setText("IP: " + IP[IPAuxiliarUm]);
                    break;
                case 1:
                    layoutRankingFourImage.addView(imageView);
                    layoutRankingFourText.setText("IP: " + IP[IPAuxiliarUm]);
                    break;
                case 0:
                    layoutRankingFiveImage.addView(imageView);
                    layoutRankingFiveText.setText("IP: " + IP[IPAuxiliarUm]);
                    break;
            }
        }
    }

    private void realizarJogada() {
        buttonDado.startAnimation(shineAnimation);

        valorDado = functionDado.rollDado();

        switch (valorDado) {
            case 1:
                buttonDado.setImageResource(R.mipmap.dado_1_foreground);
                break;
            case 2:
                buttonDado.setImageResource(R.mipmap.dado_2_foreground);
                break;
            case 3:
                buttonDado.setImageResource(R.mipmap.dado_3_foreground);
                break;
            case 4:
                buttonDado.setImageResource(R.mipmap.dado_4_foreground);
                break;
            case 5:
                buttonDado.setImageResource(R.mipmap.dado_5_foreground);
                break;
            case 6:
                buttonDado.setImageResource(R.mipmap.dado_6_foreground);
                break;
        }

        if(numeroJogador == 0) {
            if(!ganhou[0]) {
                if ((positionAtualPino1 + valorDado) > 43) {
                    layoutInicialID = layoutGroupCasasUm[positionAtualPino1];
                    layoutFinalID = layoutGroupCasasUm[0];

                    ConstraintLayout genericLayoutInicial = findViewById(layoutInicialID);
                    ConstraintLayout genericLayoutFinal = findViewById(layoutFinalID);

                    genericLayoutInicial.removeView(imagemPinoUm);
                    genericLayoutFinal.addView(imagemPinoUm);

                    retirarCarta();
                    buttonDado.setEnabled(false);
                    buttonCarta.setEnabled(true);

                    ganhou[0] = true;
                } else {
                    layoutInicialID = layoutGroupCasasUm[positionAtualPino1];
                    layoutFinalID = layoutGroupCasasUm[positionAtualPino1 + valorDado];

                    ConstraintLayout genericLayoutInicial = findViewById(layoutInicialID);
                    ConstraintLayout genericLayoutFinal = findViewById(layoutFinalID);

                    genericLayoutInicial.removeView(imagemPinoUm);
                    genericLayoutFinal.addView(imagemPinoUm);

                    positionAtualPino1 += valorDado;

                    if(positionAtualPino1 == 22){
                        IP[0] += 10;
                    }

                    retirarCarta();
                    buttonDado.setEnabled(false);
                    buttonCarta.setEnabled(true);
                }
            }

            numeroJogador = 1;
        } else if (numeroJogador == 1){
            if(!ganhou[1]) {
                if ((positionAtualPino2 + valorDado) > 43) {
                    layoutInicialID = layoutGroupCasasDois[positionAtualPino2];
                    layoutFinalID = layoutGroupCasasDois[0];

                    ConstraintLayout genericLayoutInicial = findViewById(layoutInicialID);
                    ConstraintLayout genericLayoutFinal = findViewById(layoutFinalID);

                    genericLayoutInicial.removeView(imagemPinoDois);
                    genericLayoutFinal.addView(imagemPinoDois);

                    retirarCarta();
                    buttonDado.setEnabled(false);
                    buttonCarta.setEnabled(true);

                    ganhou[1] = true;
                } else {
                    layoutInicialID = layoutGroupCasasDois[positionAtualPino2];
                    layoutFinalID = layoutGroupCasasDois[positionAtualPino2 + valorDado];

                    ConstraintLayout genericLayoutInicial = findViewById(layoutInicialID);
                    ConstraintLayout genericLayoutFinal = findViewById(layoutFinalID);

                    genericLayoutInicial.removeView(imagemPinoDois);
                    genericLayoutFinal.addView(imagemPinoDois);

                    positionAtualPino2 += valorDado;

                    if(positionAtualPino2 == 22){
                        IP[1] += 10;
                    }

                    retirarCarta();
                    buttonDado.setEnabled(false);
                    buttonCarta.setEnabled(true);
                }
            }

            numeroJogador = 2;
        } else if (numeroJogador == 2){
            if(!ganhou[2]) {
                if ((positionAtualPino3 + valorDado) > 43) {
                    layoutInicialID = layoutGroupCasasTres[positionAtualPino3];
                    layoutFinalID = layoutGroupCasasTres[0];

                    ConstraintLayout genericLayoutInicial = findViewById(layoutInicialID);
                    ConstraintLayout genericLayoutFinal = findViewById(layoutFinalID);

                    genericLayoutInicial.removeView(imagemPinoTres);
                    genericLayoutFinal.addView(imagemPinoTres);

                    retirarCarta();
                    buttonDado.setEnabled(false);
                    buttonCarta.setEnabled(true);

                    ganhou[2] = true;
                } else {
                    layoutInicialID = layoutGroupCasasTres[positionAtualPino3];
                    layoutFinalID = layoutGroupCasasTres[positionAtualPino3 + valorDado];

                    ConstraintLayout genericLayoutInicial = findViewById(layoutInicialID);
                    ConstraintLayout genericLayoutFinal = findViewById(layoutFinalID);

                    genericLayoutInicial.removeView(imagemPinoTres);
                    genericLayoutFinal.addView(imagemPinoTres);

                    positionAtualPino3 += valorDado;

                    if(positionAtualPino3 == 22){
                        IP[2] += 10;
                    }

                    retirarCarta();
                    buttonDado.setEnabled(false);
                    buttonCarta.setEnabled(true);
                }
            }

            numeroJogador = 3;
        } else if (numeroJogador == 3){
            if(!ganhou[3]) {
                if ((positionAtualPino4 + valorDado) > 43) {
                    layoutInicialID = layoutGroupCasasQuatro[positionAtualPino4];
                    layoutFinalID = layoutGroupCasasQuatro[0];

                    ConstraintLayout genericLayoutInicial = findViewById(layoutInicialID);
                    ConstraintLayout genericLayoutFinal = findViewById(layoutFinalID);

                    genericLayoutInicial.removeView(imagemPinoQuatro);
                    genericLayoutFinal.addView(imagemPinoQuatro);

                    retirarCarta();
                    buttonDado.setEnabled(false);
                    buttonCarta.setEnabled(true);

                    ganhou[3] = true;
                } else {
                    layoutInicialID = layoutGroupCasasQuatro[positionAtualPino4];
                    layoutFinalID = layoutGroupCasasQuatro[positionAtualPino4 + valorDado];

                    ConstraintLayout genericLayoutInicial = findViewById(layoutInicialID);
                    ConstraintLayout genericLayoutFinal = findViewById(layoutFinalID);

                    genericLayoutInicial.removeView(imagemPinoQuatro);
                    genericLayoutFinal.addView(imagemPinoQuatro);

                    positionAtualPino4 += valorDado;

                    if(positionAtualPino4 == 22){
                        IP[3] += 10;
                    }

                    retirarCarta();
                    buttonDado.setEnabled(false);
                    buttonCarta.setEnabled(true);
                }
            }

            numeroJogador = 0;
        }
    }

    private void retirarCarta(){
        buttonDado.clearAnimation();
        buttonCarta.startAnimation(shineAnimation);

        buttonCarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonCarta.clearAnimation();

                buttonCarta.setEnabled(false);

                valorCarta = functionRandomCarta.rollCarta();

                switch (valorCarta){
                    case 0:
                        cartaAnimation.setText("Parabéns! Você passou de primeira em uma matéria.\n+5 IP");

                        if(numeroJogador == 0){
                            IP[3] += 5;
                        } else {
                            IP[numeroJogador - 1] += 5;
                        }
                        break;

                    case 1:
                        cartaAnimation.setText("Bom apetite! Você fez uma refeição no Restaurante Universitário.\n+2 IP");

                        if(numeroJogador == 0){
                            IP[3] += 2;
                        } else {
                            IP[numeroJogador - 1] += 2;
                        }
                        break;

                    case 2:
                        cartaAnimation.setText("Excelente! Você apresentou uma palestra para seus colegas e professores.\n+5 IP");

                        if(numeroJogador == 0){
                            IP[3] += 5;
                        } else {
                            IP[numeroJogador - 1] += 5;
                        }
                        break;

                    case 3:
                        cartaAnimation.setText("Você organizou uma sessão de estudo em grupo e criou um ambiente colaborativo.\n+2 IP");

                        if(numeroJogador == 0){
                            IP[3] += 2;
                        } else {
                            IP[numeroJogador - 1] += 2;
                        }
                        break;

                    case 4:
                        cartaAnimation.setText("Inovador! Você desenvolveu um projeto de software que auxilia a comunidade acadêmica.\n+5 IP");

                        if(numeroJogador == 0){
                            IP[3] += 5;
                        } else {
                            IP[numeroJogador - 1] += 5;
                        }
                        break;

                    case 5:
                        cartaAnimation.setText("Bravo! Você alcançou proficiência em um novo idioma.\n+3 IP");

                        if(numeroJogador == 0){
                            IP[3] += 3;
                        } else {
                            IP[numeroJogador - 1] += 3;
                        }
                        break;

                    case 6:
                        cartaAnimation.setText("Genial! Você participou de um programa de mentoria para estudantes do primeiro período.\n+2 IP");

                        if(numeroJogador == 0){
                            IP[3] += 2;
                        } else {
                            IP[numeroJogador - 1] += 2;
                        }
                        break;

                    case 7:
                        cartaAnimation.setText("Notável! Você participou de um projeto de pesquisa que aborda questões sociais.\n+3 IP");

                        if(numeroJogador == 0){
                            IP[3] += 3;
                        } else {
                            IP[numeroJogador - 1] += 3;
                        }
                        break;

                    case 8:
                        cartaAnimation.setText("Notável! Você participou de um projeto de pesquisa que aborda questões ambientais.\n+3 IP");

                        if(numeroJogador == 0){
                            IP[3] += 3;
                        } else {
                            IP[numeroJogador - 1] += 3;
                        }
                        break;

                    case 9:
                        cartaAnimation.setText("Admirável! Você se voluntariou em programas de assistência social.\n+3 IP");

                        if(numeroJogador == 0){
                            IP[3] += 3;
                        } else {
                            IP[numeroJogador - 1] += 3;
                        }
                        break;

                    case 10:
                        cartaAnimation.setText("Líder! Você desenvolveu habilidades de liderança em um grupo estudantil.\n+2 IP");

                        if(numeroJogador == 0){
                            IP[3] += 2;
                        } else {
                            IP[numeroJogador - 1] += 2;
                        }
                        break;

                    case 11:
                        cartaAnimation.setText("Preparado! Você completou um curso que promove habilidades de empregabilidade.\n+3 IP");

                        if(numeroJogador == 0){
                            IP[3] += 3;
                        } else {
                            IP[numeroJogador - 1] += 3;
                        }
                        break;

                    case 12:
                        cartaAnimation.setText("Empreendedor! Você criou uma iniciativa empreendedora com impacto positivo.\n+5 IP");

                        if(numeroJogador == 0){
                            IP[3] += 5;
                        } else {
                            IP[numeroJogador - 1] += 5;
                        }
                        break;

                    case 13:
                        cartaAnimation.setText("Sustentável! Você implementou melhorias sustentáveis na universidade.\n+3 IP");

                        if(numeroJogador == 0){
                            IP[3] += 3;
                        } else {
                            IP[numeroJogador - 1] += 3;
                        }
                        break;

                    case 14:
                        cartaAnimation.setText("Unificador! Você participou de um programa de intercâmbio cultural dentro do país.\n+4 IP");

                        if(numeroJogador == 0){
                            IP[3] += 4;
                        } else {
                            IP[numeroJogador - 1] += 4;
                        }
                        break;

                    case 15:
                        cartaAnimation.setText("Economista! Você completou um curso de educação financeira oferecido pela universidade.\n+3 IP");

                        if(numeroJogador == 0){
                            IP[3] += 3;
                        } else {
                            IP[numeroJogador - 1] += 3;
                        }
                        break;

                    case 16:
                        cartaAnimation.setText("Que pena! Você desperdiçou comida no Restaurante Universitário.\n-2 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 2;
                        } else {
                            IP[numeroJogador - 1] -= 2;
                        }
                        break;

                    case 17:
                        cartaAnimation.setText("Desorganizado! Você jogou lixo no campus fora das lixeiras apropriadas.\n-3 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 3;
                        } else {
                            IP[numeroJogador - 1] -= 3;
                        }
                        break;

                    case 18:
                        cartaAnimation.setText("Descuidado! Você foi pego plagiando um trabalho.\n-5 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 5;
                        } else {
                            IP[numeroJogador - 1] -= 5;
                        }
                        break;

                    case 19:
                        cartaAnimation.setText("Negligente! Você não participou de uma atividade comunitária importante.\n-3 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 3;
                        } else {
                            IP[numeroJogador - 1] -= 3;
                        }
                        break;

                    case 20:
                        cartaAnimation.setText("Irresponsável! Você não cumpriu um projeto importante dentro do prazo.\n-3 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 3;
                        } else {
                            IP[numeroJogador - 1] -= 3;
                        }
                        break;

                    case 21:
                        cartaAnimation.setText("Impontual! Você faltou a um compromisso importante com seu grupo de pesquisa.\n-2 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 2;
                        } else {
                            IP[numeroJogador - 1] -= 2;
                        }
                        break;

                    case 22:
                        cartaAnimation.setText("Insensível! Você desrespeitou a diversidade cultural em uma atividade de intercâmbio.\n-4 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 4;
                        } else {
                            IP[numeroJogador - 1] -= 4;
                        }
                        break;

                    case 23:
                        cartaAnimation.setText("Mal preparado! Você não estudou para um exame importante.\n-2 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 2;
                        } else {
                            IP[numeroJogador - 1] -= 2;
                        }
                        break;

                    case 24:
                        cartaAnimation.setText("Infrator! Você não cumpriu as normas de segurança do laboratório.\n-4 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 4;
                        } else {
                            IP[numeroJogador - 1] -= 4;
                        }
                        break;

                    case 25:
                        cartaAnimation.setText("Desmotivado! Você deixou de participar de um grupo de apoio acadêmico.\n-2 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 2;
                        } else {
                            IP[numeroJogador - 1] -= 2;
                        }
                        break;

                    case 26:
                        cartaAnimation.setText("Desengajado! Você não contribuiu para projetos de pesquisa coletiva.\n-3 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 3;
                        } else {
                            IP[numeroJogador - 1] -= 3;
                        }
                        break;

                    case 27:
                        cartaAnimation.setText("Desatento! Você ignorou atividades de desenvolvimento de habilidades interpessoais.\n-2 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 2;
                        } else {
                            IP[numeroJogador - 1] -= 2;
                        }
                        break;

                    case 28:
                        cartaAnimation.setText("Omissão! Você não propôs melhorias para a sustentabilidade no campus.\n-3 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 3;
                        } else {
                            IP[numeroJogador - 1] -= 3;
                        }
                        break;

                    case 29:
                        cartaAnimation.setText("Descomprometido! Você não participou de eventos culturais da universidade.\n-2 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 2;
                        } else {
                            IP[numeroJogador - 1] -= 2;
                        }
                        break;

                    case 30:
                        cartaAnimation.setText("Despreparado! Você não completou um curso de inclusão digital.\n-3 IP");

                        if(numeroJogador == 0){
                            IP[3] -= 3;
                        } else {
                            IP[numeroJogador - 1] -= 3;
                        }
                        break;
                }

                layoutCartaAnimation.setVisibility(View.VISIBLE);
                cartaAnimation.setVisibility(View.VISIBLE);
                layoutCartaAnimation.startAnimation(scaleRotateAnimation);
                cartaAnimation.startAnimation(scaleRotateAnimation);



                layoutCartaAnimation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        layoutCartaAnimation.setVisibility(View.GONE);
                        cartaAnimation.setVisibility(View.GONE);

                        buttonDado.setEnabled(true);
                        buttonCarta.setEnabled(false);

                        buttonDado.startAnimation(shineAnimation);

                        if(ganhou[0] && ganhou[1] && ganhou[2] && ganhou[3]){
                            Intent terminarJogo = new Intent(Jogo.this, FinalActivity.class);

                            terminarJogo.putExtra("IPUm", IP[0]);
                            terminarJogo.putExtra("IPDois", IP[1]);
                            terminarJogo.putExtra("IPTres", IP[2]);
                            terminarJogo.putExtra("IPQuatro", IP[3]);

                            startActivity(terminarJogo);
                        }
                    }
                });
            }
        });
    }

    /*private void moverPino(ConstraintLayout layoutInicial, ConstraintLayout layoutFinal, ImageView pino){
        layoutInicial.getLocationOnScreen(coordenadasInicial);
        layoutFinal.getLocationOnScreen(coordenadasFinal);

        coordenadasInicialX = coordenadasInicial[0];
        coordenadasInicialY = coordenadasInicial[1];

        coordenadasFinalX = coordenadasFinal[0];
        coordenadasFinalY = coordenadasFinal[1];

        deltaX = coordenadasFinalX - coordenadasInicialX;
        deltaY = coordenadasFinalY - coordenadasInicialY;

        TranslateAnimation translateAnimation = new TranslateAnimation(0, deltaX, 0, deltaY);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);

        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                layoutInicial.removeView(pino);
                layoutFinal.addView(pino);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        pino.startAnimation(translateAnimation);
    }*/

    private void abrirLayoutRanking() {
        atualizarRanking();

        layoutRanking.setVisibility(View.VISIBLE);

        TranslateAnimation animate = new TranslateAnimation(
                layoutRanking.getWidth(), 0, 0, 0);
        animate.setDuration(500);
        animate.setFillAfter(true);

        layoutRanking.startAnimation(animate);

        layoutRankingAberto = true;
    }

    private void fecharLayoutRanking() {
        TranslateAnimation animate = new TranslateAnimation(
                0, layoutRanking.getWidth(), 0, 0);
        animate.setDuration(500);
        animate.setFillAfter(true);

        layoutRanking.startAnimation(animate);

        layoutRanking.setVisibility(View.GONE);

        layoutRankingAberto = false;
    }
}