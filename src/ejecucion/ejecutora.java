package ejecucion;

import ejercicio2.Libro;

public class ejecutora {
    public static void main(String[] args) {
        //sin parametros
        Libro Libro2=new Libro();
        //System.out.println(Libro2.mostrarDetalles());
        Libro2.actualizarPrecio(233.55f);
        System.out.println(Libro2.mostrarDetalles());

        Libro Libro3 = new Libro("TAC","alfa omega","prueba",340f);
        System.out.println(Libro3.mostrarDetalles());
        Libro3.actualizarPrecio(450.5f);
        System.out.println(Libro3.mostrarDetalles());
    }

}
