// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mesada = 50;
        System.out.println("Quantos meses deseja poupar?");
        int entrada = leitor.nextInt();

        int total = mesada * entrada;

        System.out.println("O valor total é de R$ " + total);       
    }}
