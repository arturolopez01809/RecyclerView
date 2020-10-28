package com.example.recyclerview;

public class EquipoFutbol {
    private String nombre;
    private String estadio;
    private String entrenador;


    public EquipoFutbol(String nombre, String estadio, String entrenador) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.entrenador = entrenador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getEntrenador() {
        return entrenador;
    }
}
