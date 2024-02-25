package com.proyecto.supermercado;

import com.proyecto.supermercado.modelos.Bebida;
import com.proyecto.supermercado.modelos.Fruta;
import com.proyecto.supermercado.modelos.Limpieza;
import com.proyecto.supermercado.modelos.ListaProductos;

/** Supermercado */
public class App {
    public static void main(String[] args) {

        ListaProductos lista = new ListaProductos();

        Bebida gaseosa1 = new Bebida("Coca-Cola Zero", 20, 1.5);
        Bebida gaseosa2 = new Bebida("Coca-Cola", 18, 1.5);
        Limpieza shampoo = new Limpieza("Shampoo Sedal", 19, 500);
        Fruta frutilla = new Fruta("Frutillas", 64, "kilo");

        lista.agregarUnProducto(gaseosa1);
        lista.agregarUnProducto(gaseosa2);
        lista.agregarUnProducto(shampoo);
        lista.agregarUnProducto(frutilla);

        lista.mostrarLista();

        System.out.println("=============================");

        lista.mostrarProductoMayorCosto();
        lista.mostrarProductoMenorCosto();
    }
}
