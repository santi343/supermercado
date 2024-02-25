package com.proyecto.supermercado.modelos;

/** Producto */
public abstract class Producto implements Comparable<Producto> {
  protected String nombre;
  protected Integer precio;

  public Producto(String nombre, Integer precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public Integer getPrecio() {
    return precio;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public int compareTo(Producto unProducto) {
    return precio > unProducto.getPrecio() ? 1 : precio < unProducto.getPrecio() ? -1 : 0;
  }

  @Override
  public String toString() {
    String cadena = "";
    cadena += "Nombre: " + nombre;
    return cadena;
  }
}
