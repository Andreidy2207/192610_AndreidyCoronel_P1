import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner notes = new Scanner(System.in);
        double[] notas = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " (0.0 a 10.0) del estudiante: ");
            while (true) {
                if (notes.hasNextDouble()) {
                    notas[i] = notes.nextDouble();
                    if (notas[i] < 0.0 || notas[i] > 10.0) {
                        System.out.println("Esta nota no es valida, tienes que volver a intentarlo con otra nota:");
                    } else {
                        break; 
                    }
                } else {
                    System.out.println("Nota no legible, trata de que se ingrese como una nota decimal:");
                    notes.next(); 
                }
            }
        }

        double promedio = (notas[0] + notas[1] + notas[2]) / 3;
        System.out.println("Su promedio fue de: " + promedio);
        
        if (promedio >= 7.0) {
            System.out.println("En hora buena tu has aprobado el curso con una muy buena nota");
        } else if (promedio >= 4.0) {
            System.out.println("Felicidades has aprobado el curso, pero tu nota es añgo regular, pero se que tu puedes mejorarla");
        } else {
            System.out.println("Te tengo malas noticias tu no has aprobado el curso, tu nota es muy bajita, tienes que repetir el curso");
        }
        
        notes.close();
    }
}
