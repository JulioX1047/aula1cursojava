import java.util.Scanner;

public class excercico1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota 1 e nota 2 para efetuar as oprações ");
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        System.out.println("Agora digite a operação que vai ser realizada 1:soma ; 2:sub ; 3: mul ; 4:div ");
        int opcao =scanner.nextInt();
        
        
        if (opcao==1) {
            
            System.out.println(soma(n1,n2));
            
        } else if (opcao==2) {
            System.out.println(sub(n1, n2));
            
        } else if (opcao==3) {
            System.out.println(mul(n1, n2));
            
        } else if (opcao==4){
            System.out.println(div(n1, n2));
        }

        









        scanner.close();
    }
    public static int soma(int a , int b){
        return a+b ;
    }
    public static int sub(int a , int b){
        return a-b;

    }
    public static int div(int a , int b){
        return  a/b;
    }
    public static int mul(int a , int b){
        return a *b ;
    }
}
