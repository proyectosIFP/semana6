package com.example.aplicacinftc.Models;

public class Reunion {

    private String nombreAsig;
    private String solicitado;
    private String fecha;
    private String hora;
    private String id;

    public Reunion(String nombreAsig, String solicitado, String fecha, String hora, String id) {
        this.nombreAsig = nombreAsig;
        this.solicitado = solicitado;
        this.fecha = fecha;
        this.hora = hora;
        this.id = id;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public String getSolicitado() {
        return solicitado;
    }

    public void setSolicitado(String solicitado) {
        this.solicitado = solicitado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
