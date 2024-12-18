import java.util.Random; // Primeira vez que uso API Random
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("---Bem vindo ao jogo de adivinhar o numero de 1 a 20 em (Tente adivinhar em até 5 tentativas)");

        Scanner sc = new Scanner(System.in);
        Random rd = new Random(); //Instanciando a classe Random

        System.out.println("Digite seu palpite");
        int palpite = sc.nextInt();
        int tentativaMax = 5;
        int numeroAdvinha = rd.nextInt(21);
        int tentativasRestantes;

        for (int i = 1; i <= tentativaMax ; i++) {  // Utilizando o For para o controle de tentativas

            if(palpite > numeroAdvinha){
                System.out.println("O numero é menor que " + palpite);
                tentativasRestantes = tentativaMax - i;
                System.out.println("Voce ainda tem " + tentativasRestantes + " tentativas restantes");
                System.out.println("Digite novamente um novo palpite:");
                palpite = sc.nextInt();

            } else if (palpite < numeroAdvinha) {
                System.out.println("O numero é maior que " + palpite);
                tentativasRestantes = tentativaMax - i;
                System.out.println("Voce ainda tem " + tentativasRestantes + " tentativas restantes");
                System.out.println("Digite novamente um novo palpite:");
                palpite = sc.nextInt();

            } else if (palpite == numeroAdvinha) {
                int tentativas = i;
                System.out.println("Parabens voce acertou na tentativa numero " + tentativas);
                return; // // Usando o return para finalizar o jogo imediatamente após o jogador acertar
            }
        }
        System.out.println("Que pena, voce nao conseguiu acertar :( O numero correto era: " + numeroAdvinha);
        sc.close();
    }
}
