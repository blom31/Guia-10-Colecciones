///EJERCICIO JUGADOR
//Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
//y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
//esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
package main_Equipo;

import Clase_Jugador.Equipo;
import Clase_Jugador.Jugador;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Equipo equip = new Equipo();
        String resp;

        do {
            Jugador j1 = new Jugador();

            System.out.println("Ingrese los datos del jugador: nombre, apellido, posición, nro: ");
            j1.setNombre(leer.next());
            j1.setApellido(leer.next());
            j1.setPosicion(leer.next());
            j1.setPosicion(leer.next());

            System.out.println("Hay un próximo Jugador?");
            resp = leer.next();
            equip.getEquipo();
//            if (!resp.equalsIgnoreCase("S") || (!resp.equalsIgnoreCase("N"))) {
//                System.out.println("Por favor ingrese S si desea agregar otro jugador o N si no hay agregará más");
//                resp = leer.next();
//            }

        } while (resp.equalsIgnoreCase("S"));
        
        for (Jugador jugador : equip.getEquipo()) {
            System.out.println(jugador.toString());
        }
        
    }

}
