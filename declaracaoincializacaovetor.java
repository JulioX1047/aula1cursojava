public class declaracaoincializacaovetor {
    public static void main(String[] args) {
        int[] numeros ={10,20,30,40,50};

        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("ultimo elemento " + numeros[4]);



        for(int i =0 ; i<numeros.length;i++){
            System.out.println("Elementos na posição " + i + ": " + numeros[i]);

        }
        
    }
}
