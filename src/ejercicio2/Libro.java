package ejercicio2;

public class Libro {
    String titulo;
    String autor;
    String Editora;
    Float precio;
    //constructor sin parametros
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.Editora="";
        this.precio = 0.0f;

    }
    public Libro(String titulo, String autor, String editora, Float precio) {
        this.titulo = titulo;
        this.autor = autor;
        Editora = editora;
        this.precio = precio;
    }

    public String mostrarDetalles() {
        return "Titulo: " + this.titulo + "\n" +
                "Autor: " + this.autor + "\n" +
                "Editora: " + this.Editora + "\n" +
                "Precio: Q" + String.format("%.2f", this.precio);
    }
    public void actualizarPrecio(float nuevoPrecio) {
            this.precio = nuevoPrecio;
            System.out.println("El precio ha sido actualizado a Q" + String.format("%.2f", this.precio));
    }
    // Métodos getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public String getEditora() {
        return Editora;
    }

    public float getPrecio() {
        return precio;
    }

    // Métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String isbn) {
        this.Editora = Editora;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}



