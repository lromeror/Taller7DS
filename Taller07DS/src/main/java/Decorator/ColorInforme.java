/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author CltControl
 */
public class ColorInforme extends InformeDecorator {
    public ColorInforme(InformeM informe) {
        super(informe);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.print(" con Color x");
    }
}
