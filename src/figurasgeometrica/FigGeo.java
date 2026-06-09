/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometrica;

/**
 *
 * @author jprod
 */
public abstract class FigGeo {
    protected double perimetro;
    protected double area;

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
    
    public abstract double calcularPerimetro();
    
    public abstract double calcularArea();
    
}
