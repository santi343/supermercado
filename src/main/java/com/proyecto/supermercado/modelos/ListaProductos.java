package com.proyecto.supermercado.modelos;

import java.util.ArrayList;
import java.util.Collections;

/** Lista */
public class ListaProductos {
  private ArrayList<Producto> listaProductos;

  public ListaProductos() {
    listaProductos = new ArrayList<>();
  }

  public void agregarProducto(Producto producto) {
    listaProductos.add(producto);
  }

  public void mostrarLista() {
    if (!listaProductos.isEmpty()) {
      listaProductos.forEach(System.out::println);
    } else {
      mensajeListaVacia();
    }
  }

  public void mostrarProductoMayorCosto() {
    if (!listaProductos.isEmpty()) {
      System.out.println(productoMayorCosto().getNombre());
    } else {
      mensajeListaVacia();
    }
  }

  public void mostrarProductoMenorCosto() {
    if (!listaProductos.isEmpty()) {
      System.out.println(productoMenorCosto().getNombre());
    } else {
      mensajeListaVacia();
    }
  }

  private void mensajeListaVacia() {
    System.out.println("Lista de Productos vacía");
  }

  private Producto productoMayorCosto() {
    return Collections.max(listaProductos);
  }

  private Producto productoMenorCosto() {
    return Collections.min(listaProductos);
  }
}
