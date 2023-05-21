
package PeliServ;

import Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:

public class PeliServ {
    
   private  Scanner leer; 
   private Pelicula pelicula;
   private ArrayList<Pelicula> cine;

    public PeliServ() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.pelicula = pelicula;
        this.cine = new ArrayList<>();
    }

    //En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
    public void crearPelicula(){
        
        String resp="";
        
        do {
            Pelicula peli = new Pelicula();
            
            System.out.print("Ingrese el nombre del Director: ");
            peli.setDirector(leer.nextLine());
            
            System.out.print("Ingrese el titulo de la Película: ");
            peli.setPelicula(leer.nextLine());
            
            System.out.print("¿Cuántas horas dura la Película? ");
            peli.setTime(leer.nextInt());
            
            cine.add(peli);
            
            System.out.print("Ingresará otra Pelicula? S/N: " );
            resp= leer.next();
            leer.nextLine();
            
            while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
                System.out.print("Ingrese S si desea agregar o N para finalizar: ");
                resp= leer.next();
               leer.nextLine();
            }
            
        } while (resp.equalsIgnoreCase("S"));
        
        
        System.out.println("Tu lista tiene " + cine.size()+ " elementos");
    }
    
     //Mostrar en pantalla todas las películas.
    
    public void mostrarPeli(){
        
        System.out.println("Tu lista de Películas");
        for (Pelicula pelicula1 : cine) {
            System.out.println(pelicula1);
        }
    }
    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    
    public void mayorhora(){
        
        System.out.println("Lista de Películas con mas de 1 hora de duración:");
        for (Pelicula pelicula1 : cine) {
            if (pelicula1.getTime()>1)
                System.out.println(pelicula1.getPelicula()+ "-" + pelicula1.getTime()+ " horas");
            
        }
    }
    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    
    public void mayorAmenor(){
        System.out.println("Lista de Películas Ordenada de mayor a menor duración:");
        
        Collections.sort(cine, Pelicula.ordenaTime);
        Collections.reverse(cine);
        
        for (Pelicula pelicula1: cine) {
            System.out.println(pelicula1.getPelicula()+" " + pelicula1.getTime()+ " horas");
        }
    }
    // Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
    
    public void menorAmayor(){
        System.out.println("Lista de Películas Ordenada de menor a mayor duración:");
        
        Collections.sort(cine,Pelicula.ordenaTime);
        for (Pelicula pelicula1 : cine) {
            System.out.println(pelicula1.getPelicula()+ "  " + pelicula1.getTime()+" horas");
            
        }
    }
    //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla
    public void ordenaTitulo(){
        System.out.println("Lista de Películas ordenada por títulos alfabéticamente");
        
        Collections.sort(cine,Pelicula.ordenaTitulo);
         for (Pelicula pelicula1 : cine) {    
             System.out.println(pelicula1.getPelicula());
        }
    }
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenaDirector(){
        System.out.println("Lista de Película ordenada por Direcor alfabéticamente");
        
        Collections.sort(cine,Pelicula.ordenaDirector);
        for (Pelicula pelicula1 : cine) {
            System.out.println(pelicula1.getDirector());
            
        }
    }
}
