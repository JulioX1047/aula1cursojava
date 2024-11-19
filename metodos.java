public class metodos {
    public static void main(String[] args) {
        
        saudacao();
        
        int resultado= somar(5, 6);
        System.out.println(" O resultado da soma é :" +resultado);
        
    }
    public static void saudacao(){
        System.out.println(("Olá , bem vindo ao curso de java "));
    }

    public static int somar(int a , int b){
        return a+b;
    }
}
