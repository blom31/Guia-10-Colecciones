
package AnimalService;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;


public class AnimalService {
    
    //instancio un animal de cada clase de tipo Animal (clase Padre)
    
    Animal dog = new Animal();
    Animal cat = new Animal();
    Animal horse = new Animal();
    
    // Hago un método  para crear un objeto de cada clsae hijo
    public void crearAnimal(){
        
        //instancio un objeto de cada clase animal hija
        dog = new Perro("Morita", "Todo", 7, "Golden");
        cat = new Gato ("Rex", "Atún", 12, "Angora"); 
        horse = new Caballo ("Rayo", "Pasto", 10, "Pura Sangre");
        
    }
    //Método que muestre el alimento de cada animal
    public void mostrarAlimento(){
        
        System.out.println("El perro " + dog.getNombre()+ " se alimenta de " + dog.getAlimento());
        System.out.println("El gato "+ cat.getNombre()+ " se alimenta de "+ cat.getAlimento());
        System.out.println("El caballo " + horse.getNombre()+ " se alimenta de " + horse.getAlimento());
    }
            
    
}
