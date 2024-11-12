public class maiorELEMENTOvetor {
    public static void main(String[] args) {
        int[] valores = {80,67,89,90,340,44};

        int maior=valores[0];

        for(int i=1 ; i<valores.length -1; i++){

            if (valores[i]> maior) {
                maior =valores[i];
                
            }
        }

        System.out.println("Maior elemento " + maior);
    }
}
