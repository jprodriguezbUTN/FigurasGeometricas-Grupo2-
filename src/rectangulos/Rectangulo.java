/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulos;

import figurasgeometrica.FigGeo;

/**
 *
 * @author jprod
 */
public class Rectangulo extends FigGeo {
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected double calcularPerimetro() {
        return (base*2)+(altura*2);
    }

    @Override
    protected double calcularArea() {
        return base*altura;
    }
    
}
