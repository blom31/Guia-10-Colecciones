
package Tienda;


public class Tienda {
    
    private String name;
    private Double precio;

    public Tienda() {
    }

    public Tienda(String name, Double precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "name=" + name + ", precio=" + precio + '}';
    }
    
    
}
//6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//names que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un name y mostrar los names que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del name y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.