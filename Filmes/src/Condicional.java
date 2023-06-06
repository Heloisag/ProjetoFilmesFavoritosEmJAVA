public class Condicional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean insertedInThePlan = false;
        double movieGrade = 8.1;
        String planType = "normal";


        if (releaseYear >= 2022) {
            System.out.println("Lançamento que os clientes estão gostando!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (insertedInThePlan == true || planType.equals("plus")) {
            System.out.println("Filme liberado para assitir");
        }else{
            System.out.println("Você deve alugar este filme para que posso assistir.");


        }
    }
}