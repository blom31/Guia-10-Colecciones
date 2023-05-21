package cine;

import PeliServ.PeliServ;

public class Cine {

  
    public static void main(String[] args) {
        
      PeliServ  ps = new PeliServ();
      
      ps.crearPelicula();
      System.out.println("----------");
      ps.mostrarPeli();
        System.out.println("----------");
      ps.mayorhora();   
      System.out.println("----------");
      ps.mayorAmenor();
       System.out.println("----------");
      ps.menorAmayor();
      System.out.println("----------");
      ps.ordenaTitulo();
      System.out.println("----------");
      ps.ordenaDirector();
    }
    
}
