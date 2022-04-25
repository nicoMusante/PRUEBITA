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
public class Triangulo {
  private double lado1;
  private double lado2;
  private double lado3;
  private String relleno;
  private String linea;
  
  public Triangulo (double unLado1, double unLado2, double unLado3){
    lado1 = (unLado1);
    lado2 = (unLado2);
    lado3 = (unLado3);
  }

  public double getLado1() {
    return lado1;
  }

  public void setLado1(double lado1) {
    this.lado1 = lado1;
  }

  public double getLado2() {
    return lado2;
  }

  public void setLado2(double lado2) {
    this.lado2 = lado2;
  }

  public double getLado3() {
    return lado3;
  }

  public void setLado3(double lado3) {
    this.lado3 = lado3;
  }

  public String getRelleno() {
    return relleno;
  }

  public void setRelleno(String relleno) {
    this.relleno = relleno;
  }

  public String getLinea() {
    return linea;
  }

  public void setLinea(String linea) {
    this.linea = linea;
  }
  
  public double getArea (){
    double S = (getLado1() + getLado2() + getLado3()) / 2;
    double Area = S*(S - getLado1())+ S * (S - getLado2()) + S * (S - getLado3());
    Area = Math.sqrt(Area);
    return (Area);
  }
  
  public double getPerimetro(){
    double lado = getLado1() + getLado2() + getLado3();
    return (lado);
  }
}


