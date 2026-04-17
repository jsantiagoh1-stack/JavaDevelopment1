package Encapsulation;

public class Main {

	public static void main(String[] args) {

	    Libros[] libros = {
	        new Libros("Metamorfosis", "Kafka", 200),
	        new Libros("El Señor de los Anillos", "Tolkien", 500),
	        new Libros("El Principito", "Saint-Exupéry", 96),
	        new Libros("1984", "George Orwell", 328),
	    };

	    for (Libros libro: libros) {
	        System.out.println(libro.getTitulo().toUpperCase() + ": " + 
	                (libro.esLargo() ? "LARGO" : "CORTO"));
	    }
	}
}