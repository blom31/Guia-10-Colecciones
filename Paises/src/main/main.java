package main;

import PaisServ.PaisServ;

public class main {

    public static void main(String[] args) {
        
                PaisServ ps = new PaisServ();
                
                ps.guardarPais();
                System.out.println("------------------");
                ps.ordenado();
                System.out.println("------------------");
                ps.eliminar();
    }
    
}
