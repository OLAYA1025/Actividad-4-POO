/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author jeron
 */
public class Velocista extends Ciclista {
    private double PotenciaPromedio;
    private double VelocidadPromedio;
    
    public Velocista(int Identificador, String Nombre, double PotenciaPromedio, 
            double VelocidadPromedio){
        super(Identificador, Nombre);
        this.PotenciaPromedio=PotenciaPromedio;
        this.VelocidadPromedio=VelocidadPromedio;
        
    }
    
    protected void ImprimirTipo(){
        System.out.println("Es un velocista");
        System.out.println("");
    }

    protected double getPotenciaPromedio() {
        return PotenciaPromedio;
    }

    protected double getVelocidadPromedio() {
        return VelocidadPromedio;
    }

    protected void setPotenciaPromedio(double PotenciaPromedio) {
        this.PotenciaPromedio = PotenciaPromedio;
    }

    protected void setVelocidadPromedio(double VelocidadPromedio) {
        this.VelocidadPromedio = VelocidadPromedio;
    }
    
    protected void Imprimir(){
        super.Imprimir();
        System.out.println("Potencia promedio: "+PotenciaPromedio+ "vatios");
        System.out.println("Velocidad promedio: "+VelocidadPromedio+" Km/h");
        System.out.println("");
    }
    
}
