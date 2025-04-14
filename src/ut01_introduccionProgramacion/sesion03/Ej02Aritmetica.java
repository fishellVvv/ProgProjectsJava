package ut01_introduccionProgramacion.sesion03;

public class Ej02Aritmetica {
    public static void main(String[] args) {

        // 2️⃣ Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.

        int a = 25, b = 7;

        System.out.println("La suma de " + a + " y " + b + " es: " + (a+b));
        System.out.println("La resta de " + a + " menos " + b + " es: " + (a-b));
        System.out.println("La multiplicación de " + a + " por " + b + " es: " + (a*b));
        System.out.println("La división de " + a + " entre " + b + " es: " + (a/b));
        System.out.println("El resto de la división de " + a + " entre " + b + " es: " + (a%b));

    }
}