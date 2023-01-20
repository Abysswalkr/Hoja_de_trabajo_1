import org.junit.Test;

import static org.junit.Assert.*;

public class CarroTest {
    Carro carro = new Carro();
    @Test
    public void turnOn() {
        carro.TurnOn();
        assertEquals(true, carro.isOnOff());
    }

    @Test
    public void turnOff() {
        carro.TurnOff();
        assertEquals(false, carro.isOnOff());
    }
    @Test
    public void setFreq() throws Exception {
        carro.setFreq("AM");
        assertEquals("AM", carro.getFreq());
    }

}