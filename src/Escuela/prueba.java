package Escuela;

public class prueba {

	public static void main(String[] args) {
	
		Libro miLibro = new Libro("La isla del tesoro");
		miLibro.setAutor("Robert Louis Stevenson");
		miLibro.setEditorial("Penguin Random House");
		miLibro.setAnio(1883);

		System.out.println(miLibro.toString());

	}

}
