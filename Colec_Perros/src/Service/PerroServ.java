package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServ {

    ArrayList<String> raza = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void addPerros() {

        String resp;
        do {
            System.out.println("Ingrese la raza del perro");
            String perro = leer.nextLine();
            raza.add(perro);

            System.out.println("Desea continuar? S/N");
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("S"));
    }

    public void mostrar() {

        System.out.println("*** LISTA DE RAZAS DE PERROS ***");
        for (String i : raza) {
            System.out.println(i.toUpperCase());
        }
        System.out.println("Tu lista de raza de perros tiene " + raza.size() + " elementos");
    }

    public void eliminar() {

        String dog;

        Iterator<String> it = raza.iterator();

        System.out.println("Ingrese la raza del perro que desea eliminar");
        dog = leer.nextLine();

        while (it.hasNext()) {
            //dog = it.next();
            if (it.next().equalsIgnoreCase(dog))
            {
                it.remove();
                System.out.println("La raza fue eliminada");
            }else {   
            System.out.println("No se encontró esa raza en la lista");
                    }
        }
        System.out.println(raza.size());
        Collections.sort(raza);
        mostrar();
    }
}

//Parte 1
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.
//parte 2
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.



//listasPerros.add(new Perro(razaPerro));