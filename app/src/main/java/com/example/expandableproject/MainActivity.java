package com.example.expandableproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<NotasBimestre> bimestres = new ArrayList<>();

        ArrayList<Nota> notas = new ArrayList<>();
        notas.add(new Nota("14"));
        notas.add(new Nota("11"));
        notas.add(new Nota("13"));
        notas.add(new Nota("12"));

        NotasBimestre notasBimestre = new NotasBimestre("Bimestre I",notas);
        bimestres.add(notasBimestre);

        ArrayList<Nota> notas2 = new ArrayList<>();
        notas2.add(new Nota("11"));
        notas2.add(new Nota("19"));
        notas2.add(new Nota("20"));
        notas2.add(new Nota("19"));

        NotasBimestre notas2Bimestre = new NotasBimestre("Bimestre II",notas2);
        bimestres.add(notas2Bimestre);

        NotaAdapter notaAdapter = new NotaAdapter(bimestres);
        recyclerView.setAdapter(notaAdapter);
    }
}
