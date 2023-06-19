
package Clase_Jugador;


import java.util.ArrayList;


public class Equipo {
    private ArrayList<Jugador> equipo;

  
    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }
      public Equipo() {
        this.equipo = new ArrayList();
    }

    
}
