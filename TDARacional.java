import java.util.Scanner;





public class TDARacional{

    //para calcular o MDC
    public static int mdc(int a, int b) {

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }

    public static int positivo(int n) {
        
        if ( n < 0){
            n = -n;
        }

       return n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Casos a serem testados: ");
        int teste = sc.nextInt();

        int numerador_resultado=0;
        int denominador_resultado=0;
        int numerador_simplificado=0;
        int denominador_simplificado=0;

        System.out.println("Digite N1/D1 operacao N2/D2");
        
        for(int i=0; i < teste; i++){
            
            int n1 = sc.nextInt();
            sc.next(); //tratamento do /
            int d1 = sc.nextInt();
            String operacao = sc.next();
            int n2 =sc.nextInt();
            sc.next(); //tratamento do /
            int d2 = sc.nextInt();

          
            if(operacao.equals("+")){
            numerador_resultado = n1*d2 +n2*d1;
            denominador_resultado = d1*d2;

            }

            if(operacao.equals("-")){
            numerador_resultado = n1 * d2 - n2 * d1;
            denominador_resultado = d1 * d2; 
            }

            if(operacao.equals("*")){
            numerador_resultado = n1 * n2;
            denominador_resultado = d1 * d2;
            }

            if(operacao.equals("/")){
            numerador_resultado = n1 * d2;
            denominador_resultado = d1 * n2;
            }


            //calculando mdc
            int divisor = mdc(positivo(numerador_resultado), positivo(denominador_resultado));
            
            //simplificando 
            numerador_simplificado = numerador_resultado / divisor;
            denominador_simplificado = denominador_resultado / divisor;

            System.out.println(
                numerador_resultado + "/" + denominador_resultado + " = " + numerador_simplificado + "/" + denominador_simplificado
            );


        }

        sc.close();
    }
}