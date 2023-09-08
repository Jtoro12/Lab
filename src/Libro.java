public class Libro{
    private String titulo;
    private Autor autor;
    public Libro(String titulo){
        this.titulo=titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
}