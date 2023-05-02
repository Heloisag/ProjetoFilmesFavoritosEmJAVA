public class Filme {

    String nome;
    int anoDeLançamento;
    int duraçãoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliaçoes;
    double totalDeAvaliaçoes;


    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("O ano de lançamento é " + anoDeLançamento);
        System.out.println("Ele tem duração de " + duraçãoEmMinutos);
        System.out.println("A soma das avaliaçoes é de " + somaDasAvaliaçoes);
        System.out.println("O total de avaliaçoes é de " + totalDeAvaliaçoes);
        System.out.println("Está incluido no plano " + incluidoNoPlano);
    }

    void avalia(double nota) {
        if (nota >5) {
            System.out.println("O valor maximo permitido é 5, porfavor " +
                    "digite sua nota novamente.");
            }
                somaDasAvaliaçoes += nota;
                totalDeAvaliaçoes++;
    }

    double pegaMedia() {
        return somaDasAvaliaçoes / totalDeAvaliaçoes;
    }
}
