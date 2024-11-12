import java.util.Scanner;


public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero=0;
        int soma=0;

        System.out.println("Digite números para somar (0 para sair )");

        while(true){

            numero=scanner.nextInt();


            if(numero==0){
                break;
            }

            soma+=numero;


        }




        scanner.close();
        System.out.println("A soma dos numeros digitados é : " +soma);
        
    }
}
