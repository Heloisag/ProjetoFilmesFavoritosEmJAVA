// CLASSE MÃE

import calculos.FiltroDeRecomendação;
import modelos.Filme;
import modelos.Serie;
import calculos.Calculadora;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // meuFilme é uma variavel que puxa as informaçoes da minha classe FILME
        meuFilme.setNome("O poderoso chefão");  // os pontos após minha variavel se chamam ATRIBUTOS.
        meuFilme.setAnoDeLançamento(1970);
        meuFilme.setDuraçãoEmMinutos(180);
        System.out.println("Duração do meu filme é de: " + meuFilme.getDuraçãoEmMinutos()
                + " minutos.");


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações é de: " + meuFilme.getTotalDeAvaliações());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLançamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("A duração da serie é de: " + lost.getDuraçãoEmMinutos() + " minutos");


        Filme outroFilme = new Filme(); // meuFilme é uma variavel que puxa as informaçoes da minha classe FILME
        outroFilme.setNome("Amor e outras drogas");  // os pontos após minha variavel se chamam ATRIBUTOS.
        outroFilme.setAnoDeLançamento(1993);
        outroFilme.setDuraçãoEmMinutos(200);

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme );
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendação filtro = new FiltroDeRecomendação();
        filtro.filtra(meuFilme);

    }
}
