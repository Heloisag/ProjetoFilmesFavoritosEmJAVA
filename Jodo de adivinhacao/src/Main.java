import java.awt.font.NumericShaper;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // Gera numero aleatorio
        int tentativas = 0;
        int valor = 0;

        //Introdução
        System.out.println("Seja bem vindo ao jogo de adivinhação! Você tem 5 tentativas no total!");

        while (tentativas < 5) {
            System.out.println("Escolha um numero de 0 a 100: ");
            valor = leitor.nextInt();
            tentativas++;

            if (valor == numeroGerado) {
                System.out.println("---- WIN GAME ----");
                System.out.println("PARABENS VOCÊ ACERTOU!!");
                break; // interrompe o loop while
            } else if (valor < numeroGerado) {
                System.out.println("Este número é menor do que o número gerado, tente novamente!");
            } else {
                System.out.println("Este número é maior do que o número gerado, tente novamente!");

            while (tentativas > 5) {
                System.out.println("Você excedeu o número máximo de tentativas");
                System.out.println("---- LOST GAME ----");
                break;
            }

            if (tentativas <= 5 && valor == numeroGerado) {
                System.out.println("---- WIN GAME ----");
                System.out.println("PARABENS VOCÊ ACERTOU EM " + numeroGerado + "TENTATIVAS!!");
                }

            }
        }
    }
}



