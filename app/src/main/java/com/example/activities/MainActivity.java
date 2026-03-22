package com.example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNomPrenom, etEmail, etTelephone, etAdresse, etVille;
    private Button btnSoumettreFormulaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomPrenom            = findViewById(R.id.etNomPrenom);
        etEmail                = findViewById(R.id.etEmail);
        etTelephone            = findViewById(R.id.etTelephone);
        etAdresse              = findViewById(R.id.etAdresse);
        etVille                = findViewById(R.id.etVille);
        btnSoumettreFormulaire = findViewById(R.id.btnSoumettreFormulaire);

        btnSoumettreFormulaire.setOnClickListener(v -> {
            String sNom     = etNomPrenom.getText().toString().trim();
            String sEmail   = etEmail.getText().toString().trim();
            String sPhone   = etTelephone.getText().toString().trim();
            String sAdresse = etAdresse.getText().toString().trim();
            String sVille   = etVille.getText().toString().trim();

            if (sNom.isEmpty() || sEmail.isEmpty()) {
                Toast.makeText(this, "Nom et Email sont obligatoires.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent i = new Intent(MainActivity.this, Screen2Activity.class);
            i.putExtra("nom",     sNom);
            i.putExtra("email",   sEmail);
            i.putExtra("phone",   sPhone);
            i.putExtra("adresse", sAdresse);
            i.putExtra("ville",   sVille);
            startActivity(i);
        });
    }
}