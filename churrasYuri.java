import java.util.Scanner;


public class churrasYuri {

    static class Carnes{

        String nome;
        int validade;
    
        Carnes(String nome, int validade){
            this.nome = nome;
            this.validade = validade;
        }

    }

    
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        //digitar o numero de carnes
        int quantidade = sc.nextInt();

        Carnes[] carnes = new Carnes[quantidade];

        for (int i = 0; quantidade > i; i++) {
            String n = sc.next();
            int v = sc.nextInt();
            carnes[i] = new Carnes(n, v);
        }

        for (int i = 0; i < quantidade -1; i++){
            for(int j = 0; j < quantidade - i - 1; j++){
                if (carnes[j].validade > carnes[j+1].validade) {
                    Carnes aux = carnes[j];
                    carnes[j] = carnes[j+1];
                    carnes[j+1] = aux;
                }
            }
        }

        System.out.println("Carnes por data de validade, qual vai pra chapa primeiro?");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(carnes[i].nome + " " + carnes[i].validade);
        }

    }
}
