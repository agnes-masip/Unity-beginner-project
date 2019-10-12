package com.example.usuari.main;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class resultats extends AppCompatActivity {
    Button info, ieinfo, nsinfo, tfinfo, jpinfo;
    Button fin;
    TextView I;
    TextView desI;
    TextView E;
    TextView desE;
    TextView T;
    TextView desT;
    TextView F;
    TextView desF, A, desA;
    TextView J, P, T2, desT2, S, desS, N, desN, desP;
    TextView desJ;
    ImageView imgresultat;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultats);



        fin = (Button) findViewById(R.id.fin);
        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DadesFormulari.esborrarDades();
                Intent fin = new Intent(resultats.this, ChooseAnalysis.class);
                fin.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(fin);
            }
        });

        int IE = DadesFormulari.getIE();
        if (IE <= 4) {
            I = (TextView) findViewById(R.id.I);
            I.setVisibility(View.VISIBLE);
            desI = (TextView) findViewById(R.id.desI);
            desI.setVisibility(View.VISIBLE);
        } else {
            E = (TextView) findViewById(R.id.E);
            E.setVisibility(View.VISIBLE);
            desE = (TextView) findViewById(R.id.desE);
            desE.setVisibility(View.VISIBLE);
        }
        int TF = DadesFormulari.getTF();
        if (TF <= 4) {
            T = (TextView) findViewById(R.id.TF);
            T.setText(getString(R.string.T));
            desT = (TextView) findViewById(R.id.desTF);
            desT.setText(getString(R.string.desT));
        } else {
            F = (TextView) findViewById(R.id.TF);
            F.setText(getString(R.string.F));
            desF = (TextView) findViewById(R.id.desTF);
            desF.setText(getString(R.string.desF));
        }
        int AT = DadesFormulari.getAT();
        if (AT <= 4) {
            A = (TextView) findViewById(R.id.AT);
            A.setText(getString(R.string.A));
            desA = (TextView) findViewById(R.id.desAT);
            desA.setText(getString(R.string.desA));
        } else {
            T2 = (TextView) findViewById(R.id.AT);
            T2.setText(getString(R.string.T2));
            desT2 = (TextView) findViewById(R.id.desAT);
            desT2.setText(getString(R.string.desT2));
        }
        int JP = DadesFormulari.getJP();
        if (JP <= 4) {
            J = (TextView) findViewById(R.id.JP);
            J.setText(getString(R.string.J));
            desJ = (TextView) findViewById(R.id.desJP);
            desJ.setText(getString(R.string.desJ));
        } else {
            P = (TextView) findViewById(R.id.JP);
            P.setText(getString(R.string.P));
            desP = (TextView) findViewById(R.id.desJP);
            desP.setText(getString(R.string.desP));
        }
        int SN = DadesFormulari.getSN();
        if (SN <= 4) {
            S = (TextView) findViewById(R.id.NS);
            S.setText(getString(R.string.S));
            desS = (TextView) findViewById(R.id.desNS);
            desS.setText(getString(R.string.desS));
        } else {
            N = (TextView) findViewById(R.id.NS);
            N.setText(getString(R.string.N));
            desN = (TextView) findViewById(R.id.desNS);
            desN.setText(getString(R.string.desN));
        }

        if (IE <= 4 && TF <= 4 && SN >= 4 && JP <= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picintj));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/intj-personality'>Arquitecte</a>";
            info.setText(Html.fromHtml(text));
        }

        //1 INTJ

        if (IE >= 4 && TF <= 4 && SN >= 4 && JP <= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picentj));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/entj-personality'>Comandant</a>";
            info.setText(Html.fromHtml(text));

        }
        //2 entj
        if (IE >= 4 && TF >= 4 && SN >= 4 && JP >= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picenfp));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/enfp-personality'>Activista</a>";
            info.setText(Html.fromHtml(text));

        }

        //3 enfp

        if (IE >= 4 && TF >= 4 && SN >= 4 && JP <= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picenfj));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/enfj-personality'>Protagonista</a>";
            info.setText(Html.fromHtml(text));

        }

        //4 enfj
        if (IE <= 4 && SN >= 4 && TF >= 4 && JP >= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picinfp));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/infp-personality'>Mediador</a>";
            info.setText(Html.fromHtml(text));

        }

        //5 infp
        if (IE <= 4 && SN <= 4 && TF >= 4 && JP >= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picisfp));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/isfp-personality'>Aventurer</a>";
            info.setText(Html.fromHtml(text));

        }

        //6 isfp
        if (IE <= 4 && SN <= 4 && TF <= 4 && JP >= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picistp));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/istp-personality'>Virtuós</a>";
            info.setText(Html.fromHtml(text));

        }

        //7 istp
        if (IE <= 4 && SN <= 4 && TF <= 4 && JP <= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picistj));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/istj-personality'>Logista</a>";
            info.setText(Html.fromHtml(text));

        }

        //8 istj
        if (IE <= 4 && SN <= 4 && TF >= 4 && JP <= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picisfj));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/isfj-personality'>Defensor</a>";
            info.setText(Html.fromHtml(text));


        }
        //9 isfj
        if (IE <= 4 && SN >= 4 && TF >= 4 && JP <= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picinfj));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/infj-personality'>Advocat</a>";
            info.setText(Html.fromHtml(text));

        }

        //10 infj
        if (IE <= 4 && SN >= 4 && TF <= 4 && JP >= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picintp));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/intp-personality'>Lògic</a>";
            info.setText(Html.fromHtml(text));

        }
        //11 intp
        if (IE >= 4 && SN <= 4 && TF >= 4 && JP >= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picesfp));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/esfp-personality'>Animador</a>";
            info.setText(Html.fromHtml(text));

        }
        //12 esfp
        if (IE >= 4 && SN >= 4 && TF <= 4 && JP >= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picentp));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/entp-personality'>Innovador</a>";
            info.setText(Html.fromHtml(text));


        }
        //13 ENTP
        if (IE >= 4 && SN <= 4 && TF <= 4 && JP <= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picestj));
            info = (Button) findViewById(R.id.info);

            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/estj-personality'>Executiu</a>";
            info.setText(Html.fromHtml(text));

        }
        //14 estj
        if (IE >= 4 && SN <= 4 && TF <= 4 && JP >= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picestp));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/estp-personality'>Emprenedor</a>";
            info.setText(Html.fromHtml(text));

        }
        //15 estp
        if (IE >= 4 && SN <= 4 && TF >= 4 && JP <= 4) {
            imgresultat = (ImageView) findViewById(R.id.imgresultat);
            imgresultat.setImageDrawable(getDrawable(R.drawable.picesfj));
            info = (Button) findViewById(R.id.info);
            info.setClickable(true);
            info.setMovementMethod(LinkMovementMethod.getInstance());
            String text = "<a href='https://www.16personalities.com/esfj-personality'>Cònsul</a>";
            info.setText(Html.fromHtml(text));

        }
        //16 esfj




    }
}
//
//






