import java.util.Scanner;

public class EhMaiorIdade {
    public static void main(String[] args) {
        System.out.println("Qual a sua idade?");
        Scanner scan = new Scanner(System.in);
        int idade= scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de Idade!");
        }else {
            System.out.println("É menor de Idade!");
        } 
        }
    }
    