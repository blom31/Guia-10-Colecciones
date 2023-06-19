
package Entidad;


public class Caballo extends Animal {
    
    private String alimentoCaballo;

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.alimentoCaballo=alimento;
    }

   
}
