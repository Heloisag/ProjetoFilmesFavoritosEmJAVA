import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String movie = leitura.nextLine();

        System.out.println("Qual o ano de lançamento do filme?");
        int anoDeLançamento = leitura.nextInt();

        System.out.println("Qual a nota do seu filme?: ");
        double avaliação = leitura.nextDouble();

        System.out.println(movie);
        System.out.println(anoDeLançamento);
        System.out.println(avaliação);
    }
}
