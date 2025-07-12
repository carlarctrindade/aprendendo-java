public class OrdemInversaVetores {
    public static void main(String[] args) {
        
        int[] vetor = {-4, 1, 5, 8, 9, 15};
        
        System.out.println("Vetor em sua ordem normal: "); {
        int count= 0;
        while (count <= (vetor.length -1)) {
            System.out.println(vetor[count]);
            count++;
        }}

        System.out.println("\nVetor em sua ordem inversa, utilizando laço While: ");{
        int count= vetor.length -1;
        while (count >= 0) {
        System.out.println(vetor[count]);
        count--;
        }}

        System.out.println("\nVetor em sua ordem inversa, utilizando laço For: ");
        for(int i= (vetor.length -1); i>=0; i--){
            System.out.println(vetor[i] + "");
        }
    }
}
