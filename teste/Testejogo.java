public class Testejogo {

    public static void main(String[] args) {
        String r1 = Jogo.jogar("par", 2, 4); // jogador deve ganhar
        String r2 = Jogo.jogar("ímpar", 1, 2); //jogador deve ganhar
        String r3 = Jogo.jogar("par", 1, 2); // computador deve ganhar

        if (!r1.equals("Jogador venceu!")) throw new RuntimeException("Teste 1 falhou");
        if (!r2.equals("Jogador venceu!")) throw new RuntimeException("Teste 2 falhou");
        if (!r3.equals("Computador venceu!")) throw new RuntimeException("Teste 3 falhou");

        System.out.println("Todos os testes passaram!");
    }
}
