package ut05OrientacionObjetos.sesion14.Ej03BibliotecaDigital;

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
