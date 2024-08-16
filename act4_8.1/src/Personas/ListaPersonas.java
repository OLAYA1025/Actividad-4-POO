/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.util.*;
public class ListaPersonas {
    
    Vector listaPersonas;
    public ListaPersonas(){
        listaPersonas=new Vector();
    }
    
     public void añadirPersona(Persona persona) {
        this.listaPersonas.add(persona);
    }

    public void eliminarPersona(int i) {
        this.listaPersonas.removeElementAt(i);
    }

    public void borrarLista() {
        this.listaPersonas.removeAllElements();
    }
}
