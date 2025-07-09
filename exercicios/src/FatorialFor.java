import java.util.Scanner;

public class FatorialFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero= scan.nextInt();
        int multiplicação= 1;

        System.out.println(numero + "!= ");

        for (int i= numero; i >=1 ; i--){
        multiplicação *= i;
        
        if (i !=1) {
            System.out.println(i + ".");
        } else {
            System.out.println(i + "=" + (multiplicação));
            }
        }
    }
}
