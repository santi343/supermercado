package com.proyecto.supermercado;

import com.proyecto.supermercado.modelos.Bebida;
import com.proyecto.supermercado.modelos.Fruta;
import com.proyecto.supermercado.modelos.Limpieza;
import com.proyecto.supermercado.modelos.ListaProductos;

/** Supermercado */
public class App {
  public static void main(String[] args) {

    ListaProductos listaProductos = new ListaProductos();

    Bebida gaseosa1 = new Bebida("Coca-Cola Zero", 20, 1.5);
    Bebida gaseosa2 = new Bebida("Coca-Cola", 18, 1.5);
    Limpieza shampoo = new Limpieza("Shampoo Sedal", 19, 500);
    Fruta frutilla = new Fruta("Frutillas", 64, "kilo");

    listaProductos.agregarProducto(gaseosa1);
    listaProductos.agregarProducto(gaseosa2);
    listaProductos.agregarProducto(shampoo);
    listaProductos.agregarProducto(frutilla);

    listaProductos.mostrarLista();

    System.out.println("=============================");

    listaProductos.mostrarProductoMayorCosto();
    listaProductos.mostrarProductoMenorCosto();
  }
}
