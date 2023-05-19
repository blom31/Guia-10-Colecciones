package AlumnoServ;

import Alumno.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServ {

    private Scanner leer;
    private ArrayList<Alumno> alumno;

    public AlumnoServ() {
        this.alumno = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearAlumno() {

        String resp = "", nombre;

        do {
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.print("Ingrese el nombre del alumno: ");
            nombre = leer.next();

            System.out.println("Ingrese la nota: ");
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            alumno.add(new Alumno(nombre, notas));
            System.out.print("Desea ingresar otro alumno? S/N ");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));

        //System.out.println(alumno.toString());
    }
    
    public void buscar(){
        String name;
        
        System.out.println("Ingrese el nombre del alumno a promediar nota");
        name = leer.next();
        
        Iterator<Alumno> it = alumno.iterator();
        
        while (it.hasNext()) {
            Alumno next = it.next();
            if (next.getNombre().equalsIgnoreCase(name)){
                notafinal(next);
            }
        }
    }
    public void notafinal(Alumno next){
        
        ArrayList<Integer> notaFinal = next.getNotas();
        double prom = 0;
        
        for (int i = 0; i < notaFinal.size(); i++) {
            prom+= notaFinal.get(i);            
        }
        double promedio = prom/notaFinal.size();
        System.out.println("El promedio del alumno "+ next.getNombre()+ " es" + promedio);
    }
    
    public void mostrar(){
        
        for(Alumno i: alumno){
            System.out.println(i);
        }
            
    }
}

//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
