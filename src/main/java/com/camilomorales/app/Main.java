package com.camilomorales.app;

import com.camilomorales.dominio.MaquinaDispensadora;

public class Main {
    public static void main(String[] args) {

        MaquinaDispensadora dispensadora = new MaquinaDispensadora(10);



        //Productos
        dispensadora.agregarProducto("10","Chocolatina",8,1500);
        dispensadora.agregarProducto("20","Galletas",5,1000);
        dispensadora.agregarProducto("30","Papitas",6,2500);
        dispensadora.agregarProducto("40","Bombom",5,500);
        dispensadora.agregarProducto("50","Doritos",6,3000);
        dispensadora.agregarProducto("60","Gaseosa",3,5000);
        dispensadora.agregarProducto("70","Cerveza",4,6000);
        dispensadora.agregarProducto("80","Chocorramo",8,2300);
        dispensadora.agregarProducto("90","Gala",0,1500);
        dispensadora.agregarProducto("100","De todito",4,3000);



        //Sacar un producto
        dispensadora.sacarUnidad("101"); //Ejemplo para mostrar que no encuentra el producto
        dispensadora.sacarUnidad("70");


        //Consultar los productos que estan agotados, en este caso los que tengan en cantidad maxima 0
        dispensadora.consultarProductosAgotados();


        //Consultar las unidades que hay por producto
        dispensadora.consultarTotalUnidades("70");

        //Aumentar la cantidad de los productos
        dispensadora.aumentarCantidad("70",4);

        dispensadora.consultarTodasUnidades();
    }
}
