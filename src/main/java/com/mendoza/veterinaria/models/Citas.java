package com.mendoza.veterinaria.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Citas {
    private int id;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime hora;
    private Status status;


    public Citas(Cliente cliente, LocalDate fecha, LocalTime hora, Status status) {
        //Tarea: Investigar como generar de manera automática ID's
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.status = status;
    }
}
