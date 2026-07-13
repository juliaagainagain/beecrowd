
import java.util.Scanner;


public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fatorial de: ");
        int num = sc.nextInt();
        int resul = 1;
        for(int i = 1; i<=num; i++){
         
            resul = resul * i;
        }
            System.out.println(resul);

    }
}
