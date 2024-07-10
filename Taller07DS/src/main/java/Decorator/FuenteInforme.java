/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author CltControl
 */
public class FuenteInforme extends InformeDecorator {
    public FuenteInforme(InformeM informe) {
        super(informe);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.print(" con Fuente Personalizada");
    }
}
