public class Favorito {
    public static void main(String[] args) {

        Filme favorito = new Filme();

        favorito.nome = "Qual o seu numero?";
        favorito.anoDeLançamento = 2011;
        favorito.duraçãoEmMinutos = 106;
        favorito.incluidoNoPlano = false;

        favorito.exibeFichaTecnica();
        favorito.avalia(3.5);
        favorito.avalia(5);
        favorito.avalia(5);

        System.out.println("A média de avaliaçoes do filme é de "
                + favorito.pegaMedia());









    }
}