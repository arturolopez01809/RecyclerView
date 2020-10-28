package com.cescristorey.recyclerview.ejemplorecyclerview;

/**
 * Created by Luis on 23/10/2017.
 */

public class EquipoFutbol {

    private String nombre;
    private String campo;
    private String entrenador;

    public EquipoFutbol(String modelo, String matricula, String entrenador) {
        this.nombre = modelo;
        this.campo = matricula;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String campo) {
        this.entrenador = entrenador;
    }


}
