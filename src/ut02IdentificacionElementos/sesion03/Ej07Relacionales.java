package ut02IdentificacionElementos.sesion03;

public class Ej07Relacionales {
    public static void main(String[] args) {

        // 7️⃣ Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.

        int x = 10, y = 20, z = 30;

        if(x>y) {
            System.out.println("X es mayor que Y");
        } else if (x==y) {
            System.out.println("X es igual que Y");
        } else {
            System.out.println("X es menor que Y");
        }

        if(x>z) {
            System.out.println("X es mayor que Z");
        } else if (x==z) {
            System.out.println("X es igual que Z");
        } else {
            System.out.println("X es menor que Z");
        }

        if(y>z) {
            System.out.println("Y es mayor que Z");
        } else if (y==z) {
            System.out.println("Y es igual que Z");
        } else {
            System.out.println("Y es menor que Z");
        }

    }
}