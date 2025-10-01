package ut05OrientacionObjetos.sesion14.Ej04Zoologico;

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
