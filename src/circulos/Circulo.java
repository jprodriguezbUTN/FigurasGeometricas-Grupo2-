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
        return calcularDiametro();
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
    
    private double calcularDiametro(){
        return 2*radio;
    }
    
    @Override
    protected double calcularPerimetro(){
        return 2*radio*PI;
    }
    
    @Override
    protected double calcularArea(){     
        return Math.pow(radio, 2)*PI;
    }
    
}
