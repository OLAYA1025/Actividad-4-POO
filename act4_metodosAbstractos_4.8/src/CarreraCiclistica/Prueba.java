package CarreraCiclistica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jeron
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Sky","Estados Unidos");
        Ciclista velocista1 = new Velocista(123979, "Geraint Thomas", 
        320, 25);
        
        Ciclista escalador1 = new Escalador(123980, "Egan Bernal", 
        25, 10);
        
        Ciclista contrarrelojista1 = new Contrarrelojista(123981, 
        "Jonathan Castroviejo", 120);
        
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);
        
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);
        
        equipo1.CalcularTotalTiempo();
        equipo1.Imprimir();
        equipo1.ListarEquipo();
        
        velocista1.Imprimir();
        escalador1.Imprimir();
        contrarrelojista1.Imprimir();
        
        //System.out.println(velocista1.getPosicionGeneral());
        
        
    }
    
}
