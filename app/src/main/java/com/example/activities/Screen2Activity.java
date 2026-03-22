package com.example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView tvTitreRecap     = findViewById(R.id.tvTitreRecap);
        TextView tvRecapInfos     = findViewById(R.id.tvRecapInfos);
        Button   btnRetourAccueil = findViewById(R.id.btnRetourAccueil);

        Intent i        = getIntent();
        String sNom     = i.getStringExtra("nom");
        String sEmail   = i.getStringExtra("email");
        String sPhone   = i.getStringExtra("phone");
        String sAdresse = i.getStringExtra("adresse");
        String sVille   = i.getStringExtra("ville");

        tvTitreRecap.setText("Récapitulatif");
        tvRecapInfos.setText(
                "Nom & Prénom : " + sNom     + "\n" +
                        "Email        : " + sEmail   + "\n" +
                        "Téléphone    : " + sPhone   + "\n" +
                        "Adresse      : " + sAdresse + "\n" +
                        "Ville        : " + sVille
        );

        btnRetourAccueil.setOnClickListener(v -> finish());
    }
}