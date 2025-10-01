package ut05OrientacionObjetos.sesion14.Ej03BibliotecaDigital;

// 3 – Biblioteca digital
// Crea una clase Recurso con atributos título y autor.
// Crea dos subclases:
//         • Libro con atributo numeroPaginas.
//         • Revista con atributo numeroEdicion.
// En cada clase implementa un mét_odo mostrarInfo() que imprima todos los datos.
// En el main, guarda vários Recurso en un array (Libro y Revista) y muestra la información de cada uno.

public class Ej03BibliotecaDigital {
    public static void main(String[] args) {
        Recurso libro1 = new Libro("El Señor de los Anillos", "J. R. R. Tolkien", 1662);
        Recurso revista1 = new Revista("Edge", "Steve Jarratt", 10);

        Recurso[] publicaciones = {libro1, revista1};

        for (Recurso r: publicaciones) {
            r.mostrarInfo();
        }
    }
}
