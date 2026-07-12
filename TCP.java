import java.util.Scanner;

public class TCP {

    static class Protocolo {

        String nome;
        int numero;

        Protocolo(String nome, int numero) {
            this.nome = nome;
            this.numero = numero;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int inicio = sc.nextInt();

            if(inicio == 1) {
                Protocolo[] protocolo = new Protocolo[99];
                int quantidade = 0;
                String nome = sc.next();


                while(nome.charAt(0) != '0') {

                    int numero = sc.nextInt();

                    protocolo[quantidade] = new Protocolo(nome, numero);
                    quantidade++;
                    nome = sc.next();
                }



                // ordena
                for(int i = 0; i < quantidade - 1; i++) {
                    for(int j = 0; j < quantidade - i - 1; j++) {
                        if(protocolo[j].numero > protocolo[j+1].numero) {
                            Protocolo aux = protocolo[j];
                            protocolo[j] = protocolo[j+1];
                            protocolo[j+1] = aux;
                        }
                    }
                }



                // imprime
                for(int i = 0; i < quantidade; i++) {
                    System.out.println(protocolo[i].nome +" "+ protocolo[i].numero);
                }
            }
        }

        sc.close();
    }
}