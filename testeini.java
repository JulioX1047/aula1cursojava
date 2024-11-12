public class testeini {
    public static void main(String[] args) {
        System.out.println("Oi");
        
        //Variavel inteira

        int idade= 25;

        //Variavel flutuante;

        double salario=4500.55;
        
        //Variavel tipo booleana 
        boolean aprovado=true;
        
        //Variavel tipo caractere unico
        char sexo='M';

        //Variavel do tipo texto(String);

        String nome="Julio Monteiro";

        //Variavel tipo consante (usando final para não permitir alteração )
        final double PI=3.14;

        //String usando operadores ternarios
        String mensagem= aprovado ? "Sim": "Não";


        System.out.println("Aprovado:" + mensagem);
    }
}
