import org.junit.jupiter.api.*;

public class TesteMoto {
    private static Moto moto = new Moto();

    @BeforeAll
    public static void antesTudo(){
        moto.setAno("2019");
        moto.setCor("Laranja");
        moto.setModelo("Scooter");
    }

    @Test
    public void testeAno(){
        Assertions.assertEquals("2019", moto.getAno(), "O ano da moto não é o esperado");
        System.out.println("A moto é de 2019");
    }

    @Test
    public void testeCor(){
        Assertions.assertEquals("Laranja", moto.getCor(), "A cor da moto não é a esperada");
        System.out.println("A cor da moto é laranja");
    }

    @Test
    public void testeModelo(){
        Assertions.assertEquals("Scooter", moto.getModelo(), "O modelo da moto não é o esperado");
        System.out.println("O modelo do carro é uma Scooter");
    }
}
