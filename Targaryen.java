import java.util.Scanner;

public class Targaryen {

    static class Dragao {

        int tempo;
        int multa;

        Dragao(int tempo, int multa) {
            this.tempo = tempo;
            this.multa = multa;
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //cria vetor para guardar os dragoes
        Dragao[] dragao = new Dragao[100];


        int quantidade = 0;


        //le ate acabar entrada
        while(sc.hasNextInt()) {

            int T = sc.nextInt();
            int F = sc.nextInt();
            dragao[quantidade] = new Dragao(T, F);
            quantidade++;

        }



        // ordenacao
        for(int i = 0; i < quantidade - 1; i++) {
            for(int j = 0; j < quantidade - i - 1; j++) {

                // compara T1/F1 com T2/F2
                // usa multiplicação cruzada
                if(dragao[j].tempo * dragao[j+1].multa > dragao[j+1].tempo * dragao[j].multa) {
                    Dragao aux = dragao[j];
                    dragao[j] = dragao[j+1];
                    dragao[j+1] = aux;

                }

            }

        }



        //multa
        int tempoTotal = 0;
        int multaTotal = 0;



        for(int i = 0; i < quantidade; i++) {
            tempoTotal += dragao[i].tempo;
            multaTotal += tempoTotal * dragao[i].multa;
        }

        System.out.println(multaTotal);
        sc.close();

    }

}

