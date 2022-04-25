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
public class Entrenador {
  String Nombre;
  double SueldoB;
  int Antiguedad;
  int CantidadC;

  public double calcularEfectividad(){
    double aux = getCantidadC() / getAntiguedad() * 100;
    return aux;
  }
  
  
  
  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String Nombre) {
    this.Nombre = Nombre;
  }

  public double getSueldoB() {
    return SueldoB;
  }

  public void setSueldoB(double SueldoB) {
    this.SueldoB = SueldoB;
  }

  public int getAntiguedad() {
    return Antiguedad;
  }

  public void setAntiguedad(int Antiguedad) {
    this.Antiguedad = Antiguedad;
  }

  public int getCantidadC() {
    return CantidadC;
  }

  public void setCantidadC(int CantidadC) {
    this.CantidadC = CantidadC;
  }
  
}
