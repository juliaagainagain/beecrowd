
import java.util.Scanner;

public class RestoDaDivisao {
    
    //tem que ler dois numeros 

    //imprimir os nomeros entre eles se o resto der zero quando 5, 2, 3 
 

    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o primeiro numero:");
        int primeiro = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundo = sc.nextInt();


        //colocar em ordem crescente 
        if (primeiro > segundo) {
            int temp = segundo;
            segundo = primeiro;
            primeiro = temp;
        }


        for (int i = primeiro; i < segundo; i++){
            
            if (i % 5 == 2 || i % 5 == 3) { 
            System.out.println(i);    
            }
            
        }

        sc.close();
    }
}
