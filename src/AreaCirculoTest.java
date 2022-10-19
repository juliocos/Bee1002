import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCirculoTest {

    private AreaCirculo ac;

    @BeforeEach
    void setup() {
        ac = new AreaCirculo();
    }

    @Test
    void teste1() {
        Assertions.assertEquals("A=12,5664", ac.calculaArea(2));
    }

    @Test
    void teste2() {
        Assertions.assertEquals("A=31819,3103", ac.calculaArea(100.64));
    }

    @Test
    void teste3() {
        Assertions.assertEquals("A=70685,7750", ac.calculaArea(150.00));
    }

}
