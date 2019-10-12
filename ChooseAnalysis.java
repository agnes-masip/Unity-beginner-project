package com.example.usuari.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class ChooseAnalysis extends AppCompatActivity {
    Button coneguts;
    Button desconeguts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_analysis);

        desconeguts=(Button)findViewById(R.id.desconeguts);
        desconeguts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desconeguts= new Intent(ChooseAnalysis.this, desconegutsMans.class );
                startActivity(desconeguts);
            }
        });
        coneguts=(Button)findViewById(R.id.coneguts);
        coneguts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coneguts= new Intent(ChooseAnalysis.this, coneguts1.class);
                startActivity(coneguts);
            }
        });
    }
    }

