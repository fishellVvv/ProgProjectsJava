package ut05OrientacionObjetos.sesion14.Ej04Zoologico;

// 4 – Zoológico
// Crea una clase Animal con atributo nombre y un mét_odo hacerSonido().
// Crea dos subclases:
// Perro que implemente hacerSonido() mostrando "Guau".
// Gato que implemente hacerSonido() mostrando "Miau".
// En el main, guarda varios animales en una lista y recórrela para que todos hagan su sonido.

public class Ej04Zoologico {
    public static void main(String[] args) {
        Animal pastorAleman01 = new Perro("Toby");
        Animal siames01 = new Gato("Michi");

        Animal[] mascotas = {pastorAleman01, siames01};

        for (Animal a: mascotas) {
            System.out.println(a.getNombre() + " dice: ");
            a.hacerSonido();
        }
    }
}
