
import java.util.Scanner;


public class LED {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        
        int contador = 0;

        for (int j = 0; j < qtd; j++) {

            System.out.println("digite o numero " + j + ":");
            String numero = sc.next();
           
            for(int i = 0; i < numero.length() ; i++){         

            //soma no contador
            if (numero.charAt(i) == '0'){
                contador = contador + 6;
            }
            if (numero.charAt(i) == '1'){
                contador = contador + 2;
            }
            if (numero.charAt(i) == '2'){
                contador = contador + 5;
            }
            if (numero.charAt(i) == '3'){
                contador = contador + 5;
            }
            if (numero.charAt(i) == '4'){
                contador = contador + 4;
            }
            if (numero.charAt(i) == '5'){
                contador = contador + 5;
            }
            if (numero.charAt(i) == '6'){
                contador = contador + 6;
            }
            if (numero.charAt(i) == '7'){
                contador = contador + 3;
            }
            if (numero.charAt(i) == '8'){
                contador = contador + 7;
            }
            if (numero.charAt(i) == '9'){
                contador = contador + 6;
            }

           

        }

            //imprime quantos leds
            System.out.println(contador + " leds");

            contador = contador - contador;
        }




    }
}