/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author jprod
 */
public class TrianguloEscaleno extends Triangulo {

    public TrianguloEscaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }
    
    private double calcularSemiPerimetro(){
        return getPerimetro()/2;
    }

    @Override
    protected double calcularArea() {
        double s=calcularSemiPerimetro();
        return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
    }
    
}
