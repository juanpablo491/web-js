/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ESTUDIANTE
 */
public class Cuadradro implements FiguraGeometrica{

    private double lado;

    public Cuadradro(double lado) {
        this.lado = lado;
    }
  
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
    
}
