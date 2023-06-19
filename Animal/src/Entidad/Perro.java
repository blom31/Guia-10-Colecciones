
package Entidad;


public class Perro extends Animal{
    
    private String alimentoPerro;

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.alimentoPerro=alimento;
    }
   
}
