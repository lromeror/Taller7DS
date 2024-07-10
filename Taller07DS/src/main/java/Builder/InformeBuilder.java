/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author CltControl
 */
public abstract class InformeBuilder {
    protected Informe informe;

    public Informe getInforme() {
        return informe;
    }
    
    public abstract void definirNombre();
    public abstract void definirContenido();
    public abstract void definirSeccion();
}
