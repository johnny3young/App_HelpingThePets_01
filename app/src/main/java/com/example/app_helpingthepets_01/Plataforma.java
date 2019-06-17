package com.example.app_helpingthepets_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Plataforma extends AppCompatActivity {

    RecyclerView recyclerview;
    List<Pet> petList;
    PetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataforma);

        //Creamos un MÉTODO para llamar a la lista. Como no existe la creamos mas abajo, acá solamente lo llamamos
        createData();

        recyclerview = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(linearLayoutManager);
        adapter = new PetAdapter(this, petList);
        recyclerview.setAdapter(adapter);
    }

    public void createData () {
        petList = new ArrayList<>();
        petList.add(new Pet("Konan","Criollo",2,"No","Gris"));
        petList.add(new Pet("Casius", "Husky", 1,"Si","Blanco"));
        petList.add(new Pet("Nikita", "Criollo", 3,"Si","Negro"));
        petList.add(new Pet("Damian", "Labrador", 2,"Si","Café"));
        petList.add(new Pet("Ringo", "Pastor Alemán", 4,"No","Negro"));
        petList.add(new Pet("Pinky", "Pastor Alemán", 4,"No","Negro"));
        petList.add(new Pet("Chavo", "Pekines", 3,"Si","Negro"));
        petList.add(new Pet("Camila", "Chiguagua", 1,"Si","Café"));
        petList.add(new Pet("Tribilin", "Dalmata", 1,"No","Blanco"));
        petList.add(new Pet("Nemesis", "Criollo", 2,"Si","Blanco"));
        petList.add(new Pet("Coquito", "Boxer", 5,"Si","Café"));


    }
}
