/*Crear 5 ejemplo de cada uno de las colecciones; Listas, Conjuntos, Mapas. 
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> lista = new ArrayList(); //creación de un Lista de tipo entero.

        //Agregar datos  a la Lista, se usa el .add
        int a = 40;
        int b = 20;
        int c = 10;
        int d = 30;
        int e = 20;

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);

        //Mosrar los elementos de la Lista, se usa un for mejorado.
        System.out.println("elementos de una lista");
        for (Integer i : lista) {
            System.out.println(i);
        }

        //Eliminar elementos de la lista se usa el .remove(i) dónde i es el índice, o .remove(e) dónde e es el elemento 
        //ejemplo con el índice
        System.out.println("eliminamos el índice 2");
        lista.remove(2);
        for (Integer j : lista) {
            System.out.println(j);
        }
        //ejemplo con el elemento
//        System.out.println("eliminamos el elemento 1");
//        numA.remove(b);
//        for (Integer k : numA) {
//            System.out.println(k);
//        }
        HashSet<String> conjunto = new HashSet(); //creación de un Conjunto
        System.out.println("Elementos de un conjunto");
        //agregar elementos a un Conjunto
        String n1 = "name 1";
        String n2 = "name 2";
        String n3 = "name 8";
        String n4 = "name 10";
        String n5 = "name 5";
        conjunto.add(n1);
        conjunto.add(n2);
        conjunto.add(n3);
        conjunto.add(n4);
        conjunto.add(n5);

        //mostrarlos elementos del conjunto
        for (String i : conjunto) {
            System.out.println(i);
        }
        //Remver un elemento del conjunto
        System.out.println("remover el elemento  name 8");

        conjunto.remove(n3);
        for (String i : conjunto) {
            System.out.println(i);
        }
        
        HashMap<Integer,String> mapa = new HashMap(); //creación de una colección mapa (lleva dos valores:llave que es irrepetible y su valor)
        //agregar valores a la colección mapa
        int dni1= 11;
        int dni2= 22;
        int dni3= 33;
        int dni4= 44;
        int dni5= 55;
        String name1= "olga";
        String name2= "aimi";
        String name3= "darwito";
        String name4= "saul";
        String name5= "olga";
        
        mapa.put(dni1,name1);
        mapa.put(dni2,name2);
        mapa.put(dni3,name3);
        mapa.put(dni4,name4);
        mapa.put(dni5,name4);
        
        for(Map.Entry<Integer,String> entry:mapa.entrySet()){
            System.out.println("El documento de "+entry.getValue()+" es "+entry.getKey());
        }
        //para remover un elemeto del mapa se hace desde su llave
        System.out.println("remover un elemento");
        mapa.remove(dni5);
         for(Map.Entry<Integer,String> entry:mapa.entrySet()){
            System.out.println("El documento de "+entry.getValue()+" es "+entry.getKey());
        }
    }

}
