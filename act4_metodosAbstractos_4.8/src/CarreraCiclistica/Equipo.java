/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

import java.util.*;
public class Equipo {
    private String Nombre;
    private String Pais;
    private static double TotalTiempo;
    private Vector ListaCiclistas;
    //constructor de equipo
    public Equipo(String Nombre, String Pais){
        this.Nombre=Nombre;
        this.Pais=Pais;
        TotalTiempo=0;
        ListaCiclistas=new Vector();
    }
    // hacemos los getter y setter de los atributos del equipo
    protected String getNombre(){
        return Nombre;
    }

    protected void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    protected String getPais() {
        return Pais;
    }
    
    protected void setPais(String Pais) {
        this.Pais=Pais;
    }
    
    //añadimos un ciclista a la lista
    
    protected void añadirCiclista(Ciclista ciclista) {
        this.ListaCiclistas.add(ciclista);
        
    }
    //para imprimir en pantalla los nombres de cada ciclista
    protected void ListarEquipo(){
        System.out.println("Jugadores del equipo:");
        for(int i=0; i<this.ListaCiclistas.size(); i++){
            Ciclista c=(Ciclista) ListaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
        System.out.println("");
        
    }
    // para saber si hay un ciclista dentro de un equipo
    protected void BuscarCiclista(String Nombre){
        for (int i=0; i< this.ListaCiclistas.size(); i++) {
            Ciclista c= (Ciclista) this.ListaCiclistas.elementAt(i);
            if (c.getNombre().equals(Nombre)){
                System.out.println("El ciclista "+Nombre+" si se encuentra en el equipo "
                +this.getNombre());
                System.out.println("");
                
            }
        }
        
    }
    //para calcular el tiempo total de los ciclistas del equipo
    protected void CalcularTotalTiempo(){
    for (int i=0; i<this.ListaCiclistas.size(); i++) {
        Ciclista c= (Ciclista) this.ListaCiclistas.elementAt(i);
        TotalTiempo+=c.getTiempoAcumulado();
    }
    }
    //imprime en pantalla la informacion sobre el equipo
    protected void Imprimir(){
        System.out.println("Nombre del equipo: "+Nombre);
        System.out.println("Pais del equipo: "+Pais);
        System.out.println("Tiempo total del equipo "+TotalTiempo);
        System.out.println("");
    }
}
