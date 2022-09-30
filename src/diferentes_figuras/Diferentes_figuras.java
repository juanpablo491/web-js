/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diferentes_figuras;

import clases.Cuadradro;
import clases.CalculadorArea;
import clases.Circulo;
import clases.Rectangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Diferentes_figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculadorArea calA = new CalculadorArea();
       int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos cuadrados quiere calcular"));
       double[] cuad = new double[opcion];
       for (int i = 0; i<opcion; i++){
           cuad[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el largo del cuadrado"));
       }
       for (int j = 0; j<opcion; j++){
            Cuadradro cua = new Cuadradro(cuad[j]);
           System.out.println("Calculo del cuadrado : "+ calA.calculadorArea(cua));
       }
       double R = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
       Circulo circulo = new Circulo (R);
       System.out.println("Calculo del circulo: " + calA.calculadorArea(circulo));
    }
    
}
