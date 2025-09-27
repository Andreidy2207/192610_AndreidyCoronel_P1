import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        
        System.out.print("Ingrese x: ");
        double x = number.nextDouble();
        System.out.print("Ingrese y: ");
        double y = number.nextDouble();
        
        if (x >= y) {
            System.out.println("Suma: " + (x + y));
            System.out.println("Diferencia: " + (x - y));
        } else {
            System.out.println("Producto: " + (x * y));
            if (y == 0) {
                System.out.println("Esta división no se puede realizar al ser divisible entre 0.");
            } else {
                System.out.println("Division: " + (x / y));
            }
        }
        
        number.close();
    }
}
