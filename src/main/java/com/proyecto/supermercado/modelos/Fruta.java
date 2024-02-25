package com.proyecto.supermercado.modelos;

/** Fruta */
public class Fruta extends Producto {
  private String unidadVenta;

  public Fruta(String nombre, Integer precio, String unidadVenta) {
    super(nombre, precio);
    this.unidadVenta = unidadVenta;
  }

  @Override
  public String toString() {
    String cadena = "";
    cadena += super.toString();
    cadena += " ///  Precio: $" + precio;
    cadena += " ///  Unidad de venta: " + unidadVenta;
    return cadena;
  }
}
