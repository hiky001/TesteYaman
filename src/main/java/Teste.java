import org.junit.jupiter.api.*;

public class Teste {
    private static Carro fusca = new Carro();

    @BeforeAll
    public static void iniciaTudo() {
        fusca.setVelocidadeAtual(0);
        fusca.setVelocidadeMaxima(120);
        fusca.setLigado(false);

    }

    @Test
    public void testeLigadoOuNao() {
        fusca.ligaEDesliga();
        Assertions.assertEquals(true, fusca.getLigado(), "O carro não está ligado");
        fusca.ligaEDesliga();
        Assertions.assertEquals(false, fusca.getLigado(), "O carro está ligado");
    }

    @Test
    public void testeAcelerou() {
        fusca.ligaEDesliga();
        fusca.acelera(50);
        Assertions.assertEquals(50, fusca.getVelocidadeAtual(), "O carro não está na velocidade esperada");
    }

    @Test
    public void testeMarcha(){
        fusca.ligaEDesliga();
        fusca.acelera(-20);
        fusca.pegaMarcha();
        Assertions.assertEquals(-1, fusca.pegaMarcha(), "retorno não aparece como no especificado");

        fusca.acelera(20);
        fusca.pegaMarcha();
        Assertions.assertEquals(1, fusca.pegaMarcha(), "retorno não aparece como no especificado");

        fusca.acelera(50);
        fusca.pegaMarcha();
        Assertions.assertEquals(2, fusca.pegaMarcha(), "retorno não aparece como no especificado");
    }

}