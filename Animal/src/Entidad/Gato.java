
package Entidad;

public class Gato extends Animal {
    
    private String alimentoGato;

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.alimentoGato= alimento;
    }
    
}
