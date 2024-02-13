import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int codigo;
    private double nota1, nota2, nota3;

    // Constructor
    public Estudiante(String nombre, int codigo, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para leer los datos del estudiante desde la entrada estándar (consola)
    public static Estudiante leerEstudianteDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el código del estudiante:");
        int codigo = scanner.nextInt();
        System.out.println("Ingrese la nota 1:");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingrese la nota 2:");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingrese la nota 3:");
        double nota3 = scanner.nextDouble();

        return new Estudiante(nombre, codigo, nota1, nota2, nota3);
    }

    // Método principal (solo para probar la clase)
    public static void main(String[] args) {
        // Leer los datos del estudiante desde la consola
        Estudiante estudiante = Estudiante.leerEstudianteDesdeConsola();

        // Calcular y mostrar el promedio del estudiante
        System.out.println("El promedio del estudiante " + estudiante.nombre + " es: " + estudiante.calcularPromedio());
    }
}