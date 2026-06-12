/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulos;

/**
 *
 * @author jprod
 */
public class Cuadrado extends Rectangulo {
    
    public Cuadrado(double lado) {
        super(lado,lado);
    }

    @Override
    protected double calcularArea() {
        return base*4;
    }

    @Override
    protected double calcularPerimetro() {
        return Math.pow(base, 2);
    }
    
    
    
}
