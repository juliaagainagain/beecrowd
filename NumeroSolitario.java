import java.util.Scanner;

class NumeroSolitario{


    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);


        System.out.print("Quantidade de numeros que tera a sequencia: ");
        int quantidade = sc.nextInt();
       

        System.out.println("digite agora a sequencia de numeros");
       
        int vet[] = new int[quantidade];

        for (int i = 0; i < quantidade; i++){
            vet[i] = sc.nextInt();
        }

        System.out.println("numero solitario:");
        for (int i = 0; i < quantidade; i++) {
            int contador = 0;

            for (int j = 0; j < quantidade; j++) {
                if (vet[i] == vet[j]) {
                 contador++;
                }
            }

            if (contador == 1) {
            System.out.println(vet[i]);
            }
        }
        


        sc.close();
    }
}