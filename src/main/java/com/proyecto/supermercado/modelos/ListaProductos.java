package com.proyecto.supermercado.modelos;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Lista
 */
public class ListaProductos {
  ArrayList<Producto> lista;

  public ListaProductos() {
    this.lista = new ArrayList<>();
  }

  public void agregarUnProducto(Producto unProducto) {
    lista.add(unProducto);
  }

  public void mostrarLista() {
    lista.forEach(System.out::println);
  }

  public void mostrarProductoMayorCosto() {
    if (!lista.isEmpty()) {
      System.out.println(productoMayorCosto().getNombre());
    }
  }

  public void mostrarProductoMenorCosto() {
    if (!lista.isEmpty()) {
      System.out.println(productoMenorCosto().getNombre());
    }
  }

  private Producto productoMayorCosto() {
    return Collections.max(this.lista);
  }

  private Producto productoMenorCosto() {
    return Collections.min(this.lista);
  }

}
