/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

/**
 *
 * @author alumnos
 */
public class Balanza {
  int monto;
  int cantidad;

  public int getMonto() {
    return monto;
  }

  public void setMonto(int monto) {
    this.monto = monto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  
  public void iniciarCompra(){
    setMonto(0);
    setCantidad(0);
  }
  
  public void registrarProducto (int peso, int precioK){
    int cant = getCantidad();
    cant ++;
    setCantidad(cant);
    int calculadora = getMonto();
    calculadora = calculadora + peso * precioK;
    setMonto (calculadora);
  }
  
  public String getResumenDeCompra(){
    String aux = "Total a pagar " + getMonto() + " por la compra de " + getCantidad() + " productos";
    return aux;
  }
  
}
