package ut01_introduccionProgramacion.sesion03;

public class Ejercicio03 {
    public static void main(String[] args) {

        // 3️⃣ Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).

        int edad = 41;

        System.out.println("La edad de la persona es: " + edad);
        System.out.println("¿La persona es mayor de edad?: " + (edad>=18));

        if (edad>=18) {
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }

    }
}