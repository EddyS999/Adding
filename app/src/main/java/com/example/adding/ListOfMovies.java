package com.example.adding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListOfMovies extends AppCompatActivity {
    Button retour, effacer;
    private File file;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_movies);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        retour = (Button) findViewById(R.id.retour);
        effacer = (Button) findViewById(R.id.delete);
        List<Film> films = new ArrayList<Film>();



        Intent intent = getIntent();
        String nom = intent.getStringExtra("NOM");
        String date = intent.getStringExtra("DATE");
        String realisateur = intent.getStringExtra("REALISATEUR");
        films.add(new Film(nom, date, realisateur));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), films));

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent action = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(action);
                finish();
            }
        });

        effacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                films.clear();
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        });


    }
}