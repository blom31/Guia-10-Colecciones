
package Entidad;


public class Electrodomestico {
    //Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
    
    protected Double precio;
    protected String color;
    protected char consumoE;
    protected Double peso;
    
 //Los constructores que se deben implementar son los siguientes:
//Un constructor vacío.

    public Electrodomestico() {
    }
//Un constructor con todos los atributos pasados por parámetro.
    public Electrodomestico(Double precio, String color, char consumoE, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
    }
    
    //Métodos getters y setters de todos los atributos.

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoE=" + consumoE + ", peso=" + peso + '}';
    }
    
    
    
}
//Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
//Los constructores que se deben implementar son los siguientes:
//Un constructor vacío.
//Un constructor con todos los atributos pasados por parámetro.
//Los métodos a implementar son:
//Métodos getters y setters de todos los atributos.