/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author jeron
 */
public abstract class Ciclista  {
    private int Identificador;
    private String Nombre;
    private int TiempoAcumulado=0;
    private int PosicionGeneral;
    //realizamos el constructor del ciclista
    public Ciclista(int Identificador, String Nombre) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
    }
    
    //añadimos el metodo abstracto que muestra que tipo de ciclista es, 
    //ya que el tipo de ciclista se define en las subclases
    abstract void ImprimirTipo();
    
    //añadimos todos los getter y setter
    protected int getIdentificador() {
        return Identificador;
    }

    protected void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    protected String getNombre() {
        return Nombre;
    }

    protected void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    protected int getTiempoAcumulado() {
        return TiempoAcumulado;
    }

    protected void setTiempoAcumulado(int TiempoAcumulado) {
        this.TiempoAcumulado = TiempoAcumulado;
    }
    
    //añadimos el get y set de la posicion del jugador
    protected void setPosicionGeneral(int PosicionGeneral){
        this.PosicionGeneral=PosicionGeneral;
    }
    
    protected int getPosicionGeneral(){
        return PosicionGeneral;
    }
    
    
    
    protected void Imprimir(){
        System.out.println("identificador: "+Identificador);
        System.out.println("Nombre: "+Nombre);
        System.out.println("Tiempo acumulado: "+TiempoAcumulado+" minutos");
        
    }
    
}
