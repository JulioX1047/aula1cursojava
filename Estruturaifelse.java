import java.util.Scanner;

public class Estruturaifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade=scanner.nextInt();

        boolean maiordeidade;

        if(idade>=18){
            maiordeidade=true;
            
        } else{
            maiordeidade=false;

        }

        String mensagem=maiordeidade ? "Sim " : "Não" ;

        System.out.println("você é maior de idade ? " +mensagem);

        scanner.close();

    }

}
