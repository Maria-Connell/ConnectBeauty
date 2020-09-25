package com.projeto.connectbeauty;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.chip.ChipGroup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadServico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_servico);
    }

    public void goBack (View view) {
        Intent intent = new Intent(this, Principal.class);
        startActivity(intent);
    }
}
