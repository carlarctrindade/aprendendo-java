import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero + ": ");

        for (int i=0; i <=10; i++) {

        System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    }
}