import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.text.StyledEditorKit;

public class LoopingIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome= scan.next();

            if (nome.equals("0")) {
            break;
            }
            
            System.out.println("Idade: ");
            idade= scan.nextInt();

            System.out.println("Nome: " + nome + " " + "Idade: " + idade);
        }
    }
}