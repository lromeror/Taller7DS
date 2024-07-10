/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author CltControl
 */
public class InformeDirector {
    private InformeBuilder builder;

    public InformeDirector(InformeBuilder informeBuilder) {
        this.builder = informeBuilder;
    }
    public void construirInforme() {
        builder.definirNombre();
        builder.definirContenido();
        builder.definirSeccion();
    }
    public Informe getInforme(){
        return builder.getInforme();
    }
}
