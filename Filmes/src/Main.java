public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome! This is the Screen match");

        String movie;
        movie = "Top gun: Maverick";
        int releaseYear = 2022;
        System.out.println("Release year: " + releaseYear);
        boolean insertedInThePlan = true;
        double movieGrade = 8.1;

        double average = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(average);
        String sinopse;
        sinopse = """
                    modelos.Filme Top Gun: Maverick
                    modelos.Filme de ação com galã dos anos 80
                    Ano de lançamento""" + releaseYear;

        System.out.println(sinopse);

    }
}