package com.mendoza.veterinaria.models;

import java.time.LocalDate;

public class Mascota {
    protected String name;
    protected LocalDate birthDate;

    public Mascota(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
