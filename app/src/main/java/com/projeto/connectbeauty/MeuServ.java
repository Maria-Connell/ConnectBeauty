package com.projeto.connectbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MeuServ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_serv);
    }

    protected void goBack (View view) {
        Intent intent = new Intent(this,Principal.class);
        startActivity(intent);
    }
}
