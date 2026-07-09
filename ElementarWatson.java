
import java.util.Scanner;


public class ElementarWatson{

    public static void main (String args[]){
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de testes: ");
        int testes = sc.nextInt();

        while(testes > 0){

            System.out.print("Digite o tamanho da sequencia de numero: "); //aqui de 1 ate quanto 
            int sequencia = sc.nextInt();

            //criar um vetor para abrigar essa sequencia 
            int[] vetor = new int[sequencia];

            System.out.println("Agora digite a sequencia de numeros:");
            for (int i = 0; sequencia > i; i++){
                vetor[i] = sc.nextInt(); 
            }

            // vetor para marcar posicoes ja visitadas
            boolean[] visitado = new boolean[sequencia];
            // false = ainda n visitado
            // true = pertence a algum ciclo

            int trocas = 0;

            //for pra nadar nesse vetor 
            for (int i = 0; i < sequencia; i++){
                if (!visitado[i]) { 
                    
                    int tamanhoCiclo = 0;
                    int atual = i;

                    while(!visitado[atual]){
                        visitado[atual] = true;
                        atual = vetor[atual] - 1;

                        tamanhoCiclo++;
                    }

                    if(tamanhoCiclo > 1) {

                        trocas += tamanhoCiclo - 1;
                    }
                }

            }
            System.out.print("sera(o) feita(s) " + trocas + " minima(s)");
            testes--;
        }





        sc.close();
    }

}
