/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulos;

/**
 *
 * @author jprod
 */
public class TrianguloEquilatero extends Triangulo {

    public TrianguloEquilatero(double lado){
        super(lado,lado,lado);
    }
    
    @Override
    protected double calcularArea() {
        return (Math.sqrt(3)/4)*Math.pow(ladoA, 2);
    }
    
}
