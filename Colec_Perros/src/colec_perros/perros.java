package colec_perros;

import Service.PerroServ;

public class perros {

    public static void main(String[] args) {
       
        System.out.println("Crear una lista con raza de perros");
         PerroServ  ps = new PerroServ();
        
        ps.addPerros();
        System.out.println("");
        ps.mostrar();
        System.out.println("");
        ps.eliminar();
        
    }
}
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.