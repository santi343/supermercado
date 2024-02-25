package com.proyecto.supermercado.modelos;

/**
 * Limpieza
 */
public class Limpieza extends Producto {
  private Integer unidadVenta;

  public Limpieza(String nombre, Integer precio, Integer unidadVenta) {
    super(nombre, precio);
    this.unidadVenta = unidadVenta;
  }

  @Override
  public String toString() {
    String cadena = "";
    cadena += super.toString();
    cadena += " ///  Contenido: " + unidadVenta + "ml";
    cadena += " ///  Precio: $" + precio;
    return cadena;
  }

}
