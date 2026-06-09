/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulos;

import figurasgeometrica.FigGeo;

/**
 *
 * @author jprod
 */
public class Circulo extends FigGeo {
    private double radio;
    private static final double PI=Math.PI;

    public double getRadio() {
        return radio;
    }
    
    public double getDiametro(){
        return radio*2;
    }

    public static double getPI() {
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public Circulo(double radio){
        this.radio=radio;
    }
    
    @Override
    public double calcularPerimetro(){
        this.perimetro=2*radio*PI;
        return perimetro;
    }
    
    @Override
    public double calcularArea(){
        this.area=Math.pow(radio, 2)*PI;
        return area;
    }
    
}
