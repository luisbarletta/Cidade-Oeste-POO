public class Main{
    public static void main (String arguments[]){
        CidadeOeste sweatyPost = new CidadeOeste();
        sweatyPost.saloes = 2;
        sweatyPost.xerifes = 1;
        sweatyPost.causadoresdeproblemas = 5;

        Vilao maurice = new Vilao();
            maurice.corChapeu = "preto";
            maurice.corBigode = "vermelho";
            maurice.sexo = "masculino";
            maurice.nomeCavalo = "Beer Gut";
            maurice.preferenciaWhiskey = "Jack Daniels";

        Humanos mary = new Humanos();
            mary.sexo = "feminino";
            mary.nomeCavalo = "Midnight";
            mary.preferenciaWhiskey = "Puro";
            mary.nome = "Mary";

        maurice.beberWhiskey();
        System.out.println(maurice.quaoBebadoEstou());
        maurice.capturarDonzela(mary);
    }
}