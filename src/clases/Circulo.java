/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ESTUDIANTE
 */
public class Circulo implements FiguraGeometrica{

    public static double PI = 3.1416;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea() {
        
    return (Circulo.PI * (this.radio * this.radio));
}}
