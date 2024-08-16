/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author jeron
 */
public class Escalador extends Ciclista {
    private float AceleracionPromedio;
    private float GradoRampa;

    public Escalador(int Identificador, String Nombre, float AceleracionPromedio, 
            float GradoRampa) {
        super(Identificador, Nombre);
        this.AceleracionPromedio = AceleracionPromedio;
        this.GradoRampa = GradoRampa;
    }
    
    protected void ImprimirTipo(){
        System.out.println("Es un escalador");
        System.out.println("");
    }

    public float getAceleracionPromedio() {
        return AceleracionPromedio;
    }

    public float getGradoRampa() {
        return GradoRampa;
    }

    public void setAceleracionPromedio(float AceleracionPromedio) {
        this.AceleracionPromedio = AceleracionPromedio;
    }

    public void setGradoRampa(float GradoRampa) {
        this.GradoRampa = GradoRampa;
    }
    
    protected void Imprimir(){
        super.Imprimir();
        System.out.println("Aceleracion promedio: "+this.AceleracionPromedio+" m/s2");
        System.out.println("Grado de rampa soportada: "+this.GradoRampa+" grados");
        System.out.println("");
    }
    
    
    
    
}
