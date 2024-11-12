import java.util.Scanner;
public class exemploFOR {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Digie um numero ");
        int numero= scanner.nextInt();


        for (int i=1; i<=10;i++){

            System.out.println(numero+ " x " + "= " + (numero*i));


        }

        scanner.close();
    }
}
