package com.example.adding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText date, nom, realisateur;
    Button enregistrer;

    String nomf, datef, realisateurf;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = (EditText) findViewById(R.id.date);
        nom = (EditText) findViewById(R.id.nom);
        realisateur = (EditText)findViewById(R.id.realisateur);

        enregistrer = (Button) findViewById(R.id.enregistrer);

        enregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomf = nom.getText().toString();
                datef = date.getText().toString();
                realisateurf = realisateur.getText().toString();

                Intent intent = new Intent(getApplicationContext(), ListOfMovies.class);
                intent.putExtra("NOM",nomf);
                intent.putExtra("DATE", datef);
                intent.putExtra("REALISATEUR", realisateurf);
                startActivity(intent);
                finish();


            }
        });

    }
}