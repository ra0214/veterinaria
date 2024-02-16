package com.mendoza.veterinaria.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Veterinaria {
    private ArrayList<Citas> citas;
    public boolean addCita(Citas cita) {
        return citas.add(cita);
    }
}
