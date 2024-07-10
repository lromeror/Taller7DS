/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author CltControl
 */
public class EstiloInforme extends InformeDecorator {
    public EstiloInforme(InformeM informe) {
        super(informe);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.print(" con Estilo x");
    }

}
