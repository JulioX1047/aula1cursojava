public class Pessoa {
    String nome ;
    int idade;

    public Pessoa(String nome , int idade) {
        this.nome=nome;
        this.idade=idade;
    }

    public void apresentar(){
        System.out.println(("Olá , meu nome  é "+ nome+ "e tenho " + idade+ "anos"));

    }
    public boolean isMaiorDeIdade(){
        return idade>=18;
        }
        public static void main(String[] args) {
            Pessoa pessoal= new Pessoa("João",20);

            pessoal.apresentar();
            System.out.println(pessoal.isMaiorDeIdade()?"É maior de idade ": "Não é maior de idade");
        }
}

