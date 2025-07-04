import java.util.Random;

public class Jogo {

    public static String jogar(String escolha, int numeroJogador, int numeroComputador) {
        int soma = numeroJogador + numeroComputador;
        boolean deuPar = soma % 2 == 0

        if ((deuPar && escolha.equalsIgnoreCase("par")) ||
            (!deuPar && escolha.equalsIgnoreCase("ímpar"))) {
            return "Jogador venceu!";
        } else {
            return "Computador venceu!";
        }
    }

    public static void main(String[] args) {
        String escolha = "par";
        int numeroJogador = 3;
        int numeroComputador = new Random().nextInt(11); 

        System.out.println("Jogador escolheu: " + escolha);
        System.out.println("Jogador jogou: " + numeroJogador);
        System.out.println("Computador jogou: " + numeroComputador);
        System.out.println("Resultado: " + jogar(escolha, numeroJogador, numeroComputador));
    }
}
