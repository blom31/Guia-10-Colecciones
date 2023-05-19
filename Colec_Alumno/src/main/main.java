package main;

import Alumno.Alumno;
import AlumnoServ.AlumnoServ;

public class main {

   public static void main(String[] args) {
       
       AlumnoServ as = new AlumnoServ();
      
       as.crearAlumno();
       as.mostrar();
       as.buscar();
    }
    
}
