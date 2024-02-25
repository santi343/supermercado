package com.proyecto.supermercado.modelos;

/** Gaseosa */
public class Bebida extends Producto {
  private Double unidadVenta;

  public Bebida(String nombre, Integer precio, Double unidadVenta) {
    super(nombre, precio);
    this.unidadVenta = unidadVenta;
  }

  @Override
  public String toString() {
    String cadena = "";
    cadena += super.toString();
    cadena += " ///  Litros: " + unidadVenta;
    cadena += " ///  Precio: $" + precio;
    return cadena;
  }
}
