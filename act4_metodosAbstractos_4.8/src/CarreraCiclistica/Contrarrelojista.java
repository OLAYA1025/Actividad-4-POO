/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author jeron
 */
public class Contrarrelojista extends Ciclista {
    
    private double VelocidadMaxima;

    public Contrarrelojista(int Identificador, String Nombre, double VelocidadMaxima) {
        super(Identificador, Nombre);
        this.VelocidadMaxima = VelocidadMaxima;
    }
    
    protected void ImprimirTipo(){
        System.out.println("Es un contrarrelojista");
        System.out.println("");
    }

    public double getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(double VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }
    
    protected void Imprimir(){
        super.Imprimir();
        System.out.println("Velocidad maxima: "+this.VelocidadMaxima+" Km/h");
        System.out.println("");
    }
    
    
    
}
