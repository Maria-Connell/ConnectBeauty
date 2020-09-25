package com.projeto.connectbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void goToPerfil(View view) {
        Intent intent = new Intent(this, PerfilUsuario.class);
        startActivity(intent);
    }

    public void goToCadServ (View view) {
        Intent intent = new Intent(this, CadServico.class);
        startActivity(intent);
    }

    public void goToMeuServ (View view) {
        Intent intent = new Intent(this, MeuServ.class);
        startActivity(intent);
    }

    public void goToFavoritos (View view) {
        Intent intent = new Intent(this, Favoritos.class);
        startActivity(intent);
    }
}
