/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica5;

/**
 *
 * @author alumnos
 */
public class Triangulo extends Figura{
  int lado1;
  int lado2;
  int lado3;
  
  public Triangulo(int Lado1, int unLado2, int unLado3, String unColorL, String unColorR){
    super (unColorR, unColorL);
    lado1 = Lado1;
    lado2 = unLado2;
    lado3 = unLado3;
  }
  
  public String toString (){
    String aux = super.toString() + " lado 1: " + getLado1() + " lado 2: " + getLado2() + " lado 3: " + getLado3(); 
    return aux;
  }
  
  public double calcularArea (){
    double S = (getLado1() + getLado2() + getLado3()) / 2;
    double Area = S*(S - getLado1())+ S * (S - getLado2()) + S * (S - getLado3());
    Area = Math.sqrt(Area);
    return Area;
  }
  
  public double calcularPerimetro(){
    double aux = getLado1() + getLado2() + getLado3();
    return aux;
  }

  public int getLado1() {
    return lado1;
  }

  public void setLado1(int lado1) {
    this.lado1 = lado1;
  }

  public int getLado2() {
    return lado2;
  }

  public void setLado2(int lado2) {
    this.lado2 = lado2;
  }

  public int getLado3() {
    return lado3;
  }

  public void setLado3(int lado3) {
    this.lado3 = lado3;
  }
  
  
  
}
