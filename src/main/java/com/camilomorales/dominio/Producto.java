package com.camilomorales.dominio;

public class Producto {


    //Atributos
    private String codigoCM;
    private String nombreCM;
    private int cantidadMaximaCM;
    private int cantidadCM;
    private double precioCM;



    //Constructor


    public Producto(String codigoCM, String nombreCM, int cantidadMaximaCM, double precioCM) {
        this.codigoCM = codigoCM;
        this.nombreCM = nombreCM;
        this.cantidadMaximaCM = cantidadMaximaCM;
        this.cantidadCM = cantidadCM;
        this.precioCM = precioCM;
    }

    //Metodos
    public void sacarUnidad(){
        if (cantidadCM > 0){
            cantidadCM--;
        }
    }

    public void aumentarCantidad(int cantidad){
        if (this.cantidadCM + cantidadCM <= cantidadMaximaCM) {
            this.cantidadCM += cantidadCM;
        }
    }


    //getters

    public String getCodigo() {
        return codigoCM;
    }

    public String getNombre() {
        return nombreCM;
    }

    public int getCantidadMaxima() {
        return cantidadMaximaCM;
    }

    public int getCantidad() {
        return cantidadCM;
    }

    public double getPrecio() {
        return precioCM;
    }


    //setters

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaximaCM = cantidadMaxima;
    }

    public void setCantidad(int cantidad) {
        this.cantidadCM = cantidad;
    }

    public void setPrecio(double precio) {
        this.precioCM = precio;
    }
}
