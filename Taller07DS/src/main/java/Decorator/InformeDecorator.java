/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author CltControl
 */
public abstract class InformeDecorator implements Informe{
    protected Informe informe;

    public InformeDecorator(Informe informe) {
        this.informe=informe;
    }

    @Override
    public void mostrar() {
        this.informe.mostrar();
    }
}
