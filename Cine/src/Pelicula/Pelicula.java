package Pelicula;

import java.util.Comparator;

public class Pelicula {

    private String director, pelicula;
    private Integer time;

    public Pelicula(String director, String pelicula, Integer time) {
        this.director = director;
        this.pelicula = pelicula;
        this.time = time;
    }

    public Pelicula() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;   
    }

    @Override
    public String toString() {
        return "Pelicula{" + "director=" + director + ", pelicula=" + pelicula + ", time=" + time + '}';
    }

    public static Comparator<Pelicula> ordenaTime= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTime().compareTo(t1.getTime());
        }
    };
    
    public static Comparator<Pelicula> ordenaTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getPelicula().compareToIgnoreCase(t1.getPelicula());
        }
    };
    
    public static Comparator<Pelicula> ordenaDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareToIgnoreCase(t1.getDirector());
        }
    };
}
