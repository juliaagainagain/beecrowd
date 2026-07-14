import java.util.Scanner;

public class Alienigenas{

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o abc dos aliens: ");
        String aliens = sc.nextLine();

       
        System.out.print("Digite uma frase humana: ");
        String humana = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < aliens.length(); i++) {
            char letraAlien = aliens.charAt(i);
            for (int j = 0; j < humana.length(); j++) {
                if (letraAlien == humana.charAt(j)) {
                contador++;
            }

            }
        }

        System.out.println(contador);
    }
}