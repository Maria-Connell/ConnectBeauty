package com.projeto.connectbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {


    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        goToPrincipal(findViewById(R.id.btn_gmail));
    }

    public void goBack (View view) {
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
    }

    public void goToPrincipal (View view) {
        Intent intent = new Intent(this, Principal.class);
        startActivity(intent);
    }

    public void goToEsqueci (View view) {
        Intent intent = new Intent(this, EsqueciMinhaSenha.class);
        startActivity(intent);
    }


}
