
import java.util.Scanner;


public class Camisetas{

    static class Pedido{

        String nome;
        String sobrenome;
        String cor;
        String tamanho;

        //construtor 
        public Pedido(String nome, String sobrenome, String cor, String tamanho) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cor = cor;
            this.tamanho = tamanho;
        }
        

    }

    static int pesoTamanho(String tamanho) {

    if (tamanho.equals("P")) {
        return 1;
    }

    if (tamanho.equals("M")) {
        return 2;
    }

    if (tamanho.equals("G")) {
        return 3;
    }

    return -1; // caso venha algum tamanho invalido 
    }


    static int pesoCor(String cor) {
    if (cor.charAt(0) == 'b') { // branco
        return 1;
    }
     return 2; // vermelho
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pedidos: ");
        int quantidade = sc.nextInt();

        System.out.println("Digite: Nome Sobrenome, cor e tamanho");
        
        //cria vetor para salvar as camisas 
        Pedido[] pedidos = new Pedido[quantidade];

        //nao ta exatamente igual pediu o enunciado pporque nao para 
        //quando o nome le "0"
        for (int i= 0;  i < quantidade; i++){

            String nome = sc.next();
            String sobrenome = sc.next();
            String cor = sc.next();
            String tamanho = sc.next();

            pedidos[i] = new Pedido(nome, sobrenome, cor, tamanho);
            

        }

        


        //ordenar
        for (int i = 0; i < quantidade - 1; i++) {
            for(int j = 0; j < quantidade - i - 1; j++){
                boolean troca = false;
                // compara cor
                if (pesoCor(pedidos[j].cor) > pesoCor(pedidos[j+1].cor)) {
                troca = true;
                } 
                
                if (pesoCor(pedidos[j].cor) == pesoCor(pedidos[j+1].cor) && pesoTamanho(pedidos[j].tamanho) > pesoTamanho(pedidos[j+1].tamanho)) {
                troca = true;
                }

                if (troca) {
                Pedido aux = pedidos[j];
                pedidos[j] = pedidos[j+1];
                pedidos[j+1] = aux;
                }
            }
        }




        //mostrar ordenado 
        for(int i = 0; i < quantidade; i++) {
            System.out.println(pedidos[i].cor +" "+ pedidos[i].tamanho +" " + pedidos[i].nome + " " + pedidos[i].sobrenome);
            
        }

        System.out.println(" ");



        
        

    }
} 