public class MediaVetor {
    public static void main(String[] args) {
        int[] valores = {20,45,80,45,78} ;

        int soma =0;

        //for(int i =0;i<=valores.length;i++){

            //soma+=valores[i];

       // }

            for (int numero:valores){
                soma+=numero;

            }

            double media = soma/valores.length ;

        System.out.println("A media é : " + media);    


    }
}
