package ut05OrientacionObjetos.cuadernoSantillana;

class Persona {
    private static final int MAY_EDAD = 18;

    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        if (edad <0 || edad > 130)
            throw new IllegalArgumentException("Edad fuera de rango.");
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public boolean esMayorEdad() { return edad >= MAY_EDAD; }

    @Override public String toString() { return nombre + " (" + edad + ")"; }
}
