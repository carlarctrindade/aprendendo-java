import java.util.Scanner;

public class Métodos {
    public static void soma () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro Número À ser somado:");
        double numero1= scan.nextDouble();

        System.out.println("Digite o segundo Número À ser somado:");
        double numero2= scan.nextDouble();

        double resultado = numero1 + numero2;

        System.out.println("O resultado é:" + resultado);
    }
    public static void main(String[] args) {
        soma();
    }
}
