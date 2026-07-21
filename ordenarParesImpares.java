
import java.util.Scanner;

public class ordenarParesImpares{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //criar vetor 
        System.out.print("Digite a quantidade de numeros que tera no vetor: ");
        int quantidade = sc.nextInt();

        int[] vetor = new int[quantidade];

        for (int i = 0; i < quantidade; i++){
            vetor[i] = sc.nextInt();
        }



        for (int i = 0; i < quantidade - 1; i++) {
            for (int j = 0; j < quantidade - 1 - i; j++) {
                if ((vetor[j] % 2 == 0 && vetor[j+1] % 2 == 0 && vetor[j] > vetor[j+1]) ||
                    (vetor[j] % 2 != 0 && vetor[j+1] % 2 != 0 && vetor[j] < vetor[j+1]) ||
                    (vetor[j] % 2 != 0 && vetor[j+1] % 2 == 0)) {
                int aux = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = aux;
               }
            }
        }


        System.out.println(" ");
        // imprimir vetor
        for (int i = 0; i < quantidade; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();

    }//fim main
}