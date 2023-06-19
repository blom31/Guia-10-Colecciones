//EJERCICIO JUGADOR
//Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
//y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
//esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
package Clase_Jugador;


public class Jugador {
    
    private String nombre, apellido, posicion;
    private Integer nro;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, Integer nro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", nro=" + nro + '}';
    }
    
    
}
