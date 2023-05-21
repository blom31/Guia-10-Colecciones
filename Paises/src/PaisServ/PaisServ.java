package PaisServ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServ {

    private Scanner leer;

    private HashSet<String> mapa;

    public PaisServ() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mapa = new HashSet<>();
    }

    public void guardarPais() {
        String resp = "";

        System.out.println("LISTA DE PAISES");

        do {
            System.out.print("Ingrese el nombre de un país:  ");
            mapa.add(leer.next());
            System.out.println("");
            System.out.print("Desea agregar otro país en la lista? S/N  ");
            resp = leer.next();
            while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
                System.out.print("Ingrese S si desea agregar o N para finalizar:  ");
                resp = leer.next();
            }
        } while (resp.equalsIgnoreCase("S"));
        System.out.println("Tu lista tiene: " + mapa.size() + " paises");
        mostrar();
    }

    public void mostrar() {

        for (String paise : mapa) {
            System.out.println(paise);
        }

    }
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.

    public void ordenado() {

        System.out.println("LISTA DE PAISES ORDENADA ALFABÉTICAMENTE");

        // (UNA FORMA DE HACERLO ES CONVERTIR A LISTA)
        ArrayList<String> paises = new ArrayList<>(this.mapa);
        Collections.sort(paises);
        System.out.println(paises);

        // (OTRA FORMA DE HACERLO ES CONVERTIR A TREESET)
        // TreeSet<String> paises = new TreeSet<>(this.mapa);
        // System.out.println(paises);
    }
    
    //se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    //buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    //usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    //al usuario.
    public boolean eliminar() {
              System.out.println("BUSQUEDA DE PAIS A ELIMINAR");
              
             Iterator<String> it =mapa.iterator();
             
             System.out.print("Ingrese el país que desea eliminar: ");
             String elimina = leer.next();
             
             while  (it.hasNext())             
                 if (it.next().equalsIgnoreCase(elimina)) {
                     it.remove();
                     System.out.println("El país se eliminó de la lista");
                     mostrar();
                     return true;
                 }
             System.out.println("El país no se encuentra");
             
             mostrar();
             return false;
          }
            
}
//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
