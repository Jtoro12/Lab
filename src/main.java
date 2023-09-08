public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        Libro libro1 = new Libro("El Quijote");
        Libro libro2 = new Libro("Cien años de soledad");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        Usuario usuario = new Usuario("Juan");
        usuario.tomarPrestado(libro1);
        usuario.tomarPrestado(libro2);

        Autor autor1 = new Autor("Miguel de Cervantes");
        autor1.agregarLibro(libro1);

        Autor autor2 = new Autor("Gabriel García Márquez");
        autor2.agregarLibro(libro2);

        System.out.println("Libros en la biblioteca:");
        for (Libro libro : biblioteca.listarLibros()) {
            System.out.println(libro.getTitulo());
        }

        System.out.println("\nLibros prestados a " + usuario.toString() + ":");
        for (Libro libro : usuario.listarLibrosPrestados()) {
            System.out.println(libro.getTitulo());
        }

        System.out.println("\nLibros escritos por " + autor1.toString() + ":");
        for (Libro libro : autor1.getLibrosEscritos()) {
            System.out.println(libro.getTitulo());
        }

        System.out.println("\nLibros escritos por " + autor2.toString() + ":");
        for (Libro libro : autor2.getLibrosEscritos()) {
            System.out.println(libro.getTitulo());
        }
    }

}
