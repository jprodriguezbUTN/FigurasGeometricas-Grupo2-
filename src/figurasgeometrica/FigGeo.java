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

    public double getPerimetro() {
        return calcularPerimetro();
    }

    public double getArea() {
        return calcularArea();
    }
    
    protected abstract double calcularPerimetro();
    
    protected abstract double calcularArea();
    
}
