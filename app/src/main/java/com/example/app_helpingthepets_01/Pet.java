package com.example.app_helpingthepets_01;

public class Pet {

    //Atributos
    String name;
    String breed;
    int age;
    String sterilized; //No lo registré por ahora en PET_LAYOUT
    String color;

    public Pet(String name, String breed, int age, String sterilized, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.sterilized = sterilized;
        this.color = color;
    }
}
