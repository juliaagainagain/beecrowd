
import java.util.Scanner;


public class NotaDeProva{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       System.out.print("Digite a nota: ");
        int nota = sc.nextInt();


       if (nota >= 86 && nota <= 100){
        System.out.println("A");
       }
       if (nota >= 61 && nota <= 85) {
        System.out.println("B");   
       }
       if (nota >= 36 && nota <= 60 ) {
        System.out.println("C");   
       }
       if (nota >= 1 && nota <= 35 ) {
        System.out.println("D");   
       }
       if (nota == 0 ) {
        System.out.println("E");   
       }
             
       sc.close();
    }

}