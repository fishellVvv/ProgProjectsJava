package ut01_introduccionProgramacion.sesion01;

/**
 * Clase "Main": Introducción a los fundamentos de la programación en Java
 * Contiene ejemplos sobre estructura básica, variables, tipos de datos, alcance
 * de variables, buenas prácticas y errores comunes.
 */

public class EjerciciosClase {

    /**
     * Método principal (punto de entrada del programa en Java).
     */

    public static void main(String[] args) {
        // Llamadas a los métodos que explican cada sección del temario
        queEsUnPrograma();
        estructuraBasica();
        declaracionVariables();
        usoVariables();
        alcanceVariables();
        buenasPracticas();
        erroresComunes();
    }

    /**
     * 1. ¿Qué es un programa?
     *  Explicación sobre qué es un programa y su propósito.
     */

    public static void queEsUnPrograma() {
        System.out.println("• Un programa es un conjunto de instrucciones que le indican a la computadora qué tareas debe realizar.");
        System.out.println("• Estas instrucciones están escritas en un lenguaje de programación que la máquina puede interpretar o compilar.");
        System.out.println("• Sin programas, las computadoras no pueden ejecutar ninguna función útil por sí sola.");
    }

    /**
     * 2. Estructura básica de un programa en Java
     *  Un programa en Java contiene:
     *  - Variables para almacenar datos.
     *  - Métodos para encapsular lógica.
     *  - Instrucciones de control de flujo (if, loops, etc.).
     */

    public static void estructuraBasica() {
        System.out.println("\n• Estructura básica de un programa en Java:");
        int numero = 42; // Variable de tipo entero
        String mensaje = "Hola mundo"; // Variable de tipo cadena
        boolean esActivo = true; // Variable booleana

        // Mostramos los valores en la consola
        System.out.println("Numero: " + numero);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Estado: " + esActivo);
    }

    /**
     * 3. Declaración de variables en Java
     *  Java es un lenguaje de tipado estático, por lo que es obligatorio especificar el tipo de cada variable al declararla.
     */

    public static void declaracionVariables() {
        System.out.println("\n• Declaración de variables en Java:");

        // Declaración e inicialización de variables
        int edad = 41; // Entero
        double altura = 1.76; // Número decimal (doble precisión)
        char inicial = 'V'; // Carácter único
        String nombre = "Victor"; // Cadena de texto

        // Mostramos los valores en la consola
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Altura: " + altura + ", Inicial: " + inicial);
    }

    /**
     * 4. Uso de variables en Java
     *  Las variables permiten almacenar datos y manipularlos en tiempo de ejecución.
     */

    public static void usoVariables() {
        System.out.println("\n• Uso de variables en Java:");

        int a = 10, b = 20; // Declaramos dos variables de tipo entero
        int suma = a + b; // Realizamos una operación matemática
        int resta = a - b;
        int multiplicacion = a * b;
        double division = (double) a / b; // Conversión de entero a decimal

        // Mostramos los resultados de las operaciones
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Uso de variables en concatenación de cadenas
        String nombre = "Vicotr";
        System.out.println("Hola, " + nombre + "! Bienvenido a Java.");
    }

    /**
     * 5. Alcance de variables
     *  Las variables pueden ser locales o globales dependiendo de donde se declaren.
     */

    public static void alcanceVariables() {
        System.out.println("\n• Alcance de variables en Java:");

        int variableGlobal = 100; // Variable con un alcance dentro del método

        if (true) {
            int variableLocal = 50; // Esta variable solo existe dentro del bloque if
            System.out.println("Variable local dentro del if: " + variableLocal);
        }

        // La siguiente línea daría error porque variableLocal no existe fuera del if
        // System.out.println(variableLocal);

        System.out.println("Variable global accesible en todo el método: " + variableGlobal);
    }

    /**
     * 6. Buenas prácticas con variables en Java
     *  Se recomienda seguir las siguientes prácticas:
     *  - Usar nombres descriptivos
     *  - Inicializar las variables al declararlas
     *  - Utilizar constantes para valores que no cambian
     */

    public static void buenasPracticas() {
        System.out.println("\n• Buenas prácticas con variables en Java:");

        int edadUsuario = 30; // Nombre descriptivo
        double precioTotal = 150.75; // Uso de camelCase para mejorar la legibilidad
        final int diasSemana = 7; // Uso de constantes para valores que no deben cambiar

        System.out.println("Edad del usuario: " + edadUsuario);
        System.out.println("Precio total: " + precioTotal);
        System.out.println("Dias de la semana: " + diasSemana);
    }

    /**
     * 7. Errores comunes con variables en Java
     *  - No iniciar una variable antes de usarla
     *  - Usar el tipo de dato incorrecto
     *  - Acceder a una variable fuera de su alcance
     */

    public static void erroresComunes() {
        System.out.println("\n• Errores comunes con variables en Java:");

        // Error: Variable no inicializada
        // int num;
        // System.out.println(num); // Esto causará un error

        //Error: Intentar asignar un String a un int
        // int edad = "veinte"; // Esto causará un error de compilación

        // Error: Variable fuera de su alcance
        if (true) {
            int x = 10;
        }
        // System.out.println(x); // Esto generaría un error

        System.out.println("Evita los errores comunes declarando y usando correctamente las variables.");
    }
}