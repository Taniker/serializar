package com.serieperro;

class Dog {
    int edad;
    String raza;
    String color;

    public Dog(int p, String t, String w) {
        edad = p;
        raza = t;
        color = w;
    }

    public int getEdad() {
        return edad;
    }
    public String getRaza() {
        return raza;
    }
    public String getColor() {
        return color;
    }
}
