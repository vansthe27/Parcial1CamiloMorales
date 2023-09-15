package com.camilomorales.dominio;

public class MaquinaDispensadora {

    //Atributos
    private Producto[] productosCM;
    private int contadorProductosCM;


    //Constructor
    public MaquinaDispensadora(int capacidad) {
        this.productosCM = new Producto[capacidad];
        this.contadorProductosCM = 0;
    }


    //Metodos
    public void agregarProducto(String codigoCM, String nombreCM, int cantidadMaximaCM, double precioCM) {
        if (contadorProductosCM >= productosCM.length) {
            System.out.println("La máquina está llena, no se puede agregar más productos.");
        } else {
            for (int i = 0; i < contadorProductosCM; i++) {
                if (productosCM[i].getCodigo().equals(codigoCM)) {
                    System.out.println("Ya existe un producto con el mismo código.");
                    return;
                }
            }
            productosCM[contadorProductosCM] = new Producto(codigoCM, nombreCM, cantidadMaximaCM, precioCM);
            contadorProductosCM++;
            System.out.println("\nProducto agregado: " + nombreCM);
        }
    }


    public void sacarUnidad(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            producto.sacarUnidad();
            System.out.println("\nSe retiró una unidad de " + producto.getNombre());
        } else {
            System.out.println("\nProducto no encontrado.");
        }
    }


    public void consultarProductosAgotados() {
        for (int i = 0; i < contadorProductosCM; i++) {
            if (productosCM[i].getCantidadMaxima() <= 0) {
                System.out.println(productosCM[i].getNombre() + " está agotado.");
            }
        }
    }


    public int consultarTotalUnidades(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            return producto.getCantidadMaxima();
        } else {
            System.out.println("Producto no encontrado.");
            return 0;
        }
    }

    public void consultarTodasUnidades() {
        for (int i = 0; i < contadorProductosCM; i++) {
            System.out.println(productosCM[i].getNombre() + ": " + productosCM[i].getCantidadMaxima() + " unidades.");
        }
    }


    public void aumentarCantidad(String codigo, int cantidad) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            producto.aumentarCantidad(cantidad);
            System.out.println("\nSe aumentaron " + cantidad + " unidades de " + producto.getNombre());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }


    private Producto buscarProducto(String codigo) {
        for (int i = 0; i < contadorProductosCM; i++) {
            if (productosCM[i].getCodigo().equals(codigo)) {
                return productosCM[i];
            }
        }
        return null;
    }

    //getters

    public Producto[] getProductos() {
        return productosCM;
    }

    public int getContadorProductos() {
        return contadorProductosCM;
    }


    //setters

    public void setProductos(Producto[] productos) {
        this.productosCM = productos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductosCM = contadorProductos;
    }
}