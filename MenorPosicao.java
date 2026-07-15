
import java.util.Scanner;

public class MenorPosicao {
     public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];

        for(int i = 0; i<tamanho; i++){
         vetor[i] = sc.nextInt();
        }
        
        int menor = vetor[0];

        for(int i = 1; i<tamanho; i++){
         if (vetor[i] < menor)
            menor = vetor[i];
       } 
       
       System.out.println(menor);
   } 
}
