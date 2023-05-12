package br.com.etecia.adotapetsdois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //Criando o carregamento da janela de login
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //abrindo a janela de login
                startActivity(new Intent(getApplicationContext(),
                        login_Activity.class));
            }
        }, 3000);
    }
}