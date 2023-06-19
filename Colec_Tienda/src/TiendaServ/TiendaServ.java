package TiendaServ;

import Tienda.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServ {

    private Scanner leer;
    private String produc;
    private HashMap<String, Double> articulo;

    public TiendaServ() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        //this.produc = produc;
        this.articulo = new HashMap()   ;
    }

    public void crear() {
        String resp = "";
        System.out.println("         ***   CARGA DE ARTÍCULOS   ***");
        System.out.println("");
        do {
            System.out.print("Ingrese el nombre del producto a cargar: ");
            String nombre = leer.next();
            System.out.print("Ingrese el precio: ");
            Double precio = leer.nextDouble();
            articulo.put(nombre, precio);
            System.out.println("Cargará otro  Producto? S/N");
            resp = leer.next();
            while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
                System.out.println("Ingrese S para agregar otro producto o N para finalizar");
                resp = leer.next();
            }
        } while (resp.equalsIgnoreCase("S"));
        menu();
    }

    //mostrar lista de productos y precios
    public void mostrar() {

        System.out.println("         ***   LISTA DE ARTÍCULOS   ***");
        for (Map.Entry<String, Double> entry : articulo.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Producto: " + key + " precio: " + value);
        }
        menu();
    }

    //modificar precio
    public void modificar() {
        String producModif;
        Double precioModif;

        System.out.println("         ***   MODIFICAR PRECIO   ***");

        System.out.print("Ingrese el producto a modificar: ");
        producModif = leer.next();

        for (Map.Entry<String, Double> entry : articulo.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            if (key.equalsIgnoreCase(producModif)) {
                System.out.print("Ingrese el precio a cambiar: ");
                precioModif = leer.nextDouble();
                articulo.replace(key, value, precioModif);
                System.out.println("PRECIO ACTUALIZADO");
                mostrar();
                break;
            }
//            else{
//                System.out.println("PRODUCTO INEXISTENTE¡¡¡");
//                break;
//            }
        }
        menu();
    }

    //eliminar un producto
    public void eliminar() {
        String productElim;

        System.out.println("         ***   ELIMINAR ARTÍCULOS   ***");

        System.out.print("Ingrese el producto a eliminar: ");
        productElim = leer.next();

        for (Map.Entry<String, Double> entry : articulo.entrySet()) {
            String key = entry.getKey();
            //Double value = entry.getValue();

            if (key.equalsIgnoreCase(productElim)) {
                articulo.remove(key);
                System.out.println("PRODUCTO ELIMINADO");
                mostrar();
                break;
            } else {
                System.out.println("EL PRODUCTO QUE DESEA ELIMINAR NO SE ENCUENTRA EN LA LISTA");
                break;
            }
        }
        mostrar();
    }

    public void menu() {
        int resp;
        String salir = "";

        do {
            System.out.println("MENÚ");

            System.out.println("1- CARGAR ARTÍCULOS Y PRECIOS");
            System.out.println("2- MOSTRAR LISTA DE ARTÍCULOS Y PRECIOS");
            System.out.println("3- MODIFICAR PRECIO");
            System.out.println("4- ELIMINAR ARTÍCULO");
            System.out.println("5- SALIR");
            System.out.print("INGRESE OPCIÓN:  ");
            resp = leer.nextInt();

            switch (resp) {
                case 1:
                    crear();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    modificar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    System.out.println("SEGURO S/N");
                    salir = leer.next();
            }
            
        } while (salir.equalsIgnoreCase("n"));
    }
}
//6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
