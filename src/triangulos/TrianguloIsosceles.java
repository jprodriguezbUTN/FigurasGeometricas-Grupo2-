/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author jprod
 */
public class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(double ladoAB, double ladoC) {
        super(ladoAB, ladoAB, ladoC);
    }

    @Override
    protected double calcularArea() {
        return (ladoC/2)*(Math.sqrt(Math.pow(ladoA, 2)-(Math.pow(ladoC/2, 2))));
    }
    
}
