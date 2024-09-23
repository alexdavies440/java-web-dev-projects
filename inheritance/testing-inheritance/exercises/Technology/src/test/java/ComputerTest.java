import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
public Computer test_computer = new Computer();

    @Test
    public void testIsOff(){
        assertFalse(test_computer.isOn());
    }

    @Test
    public void testPowerButton() {
        test_computer.turnOn(true);
        assertTrue(test_computer.isOn());
    }

    @Test
    public void testOS() {
        assertTrue(test_computer.getOS() == "Linux");
    }

    @Test
    public void testMemory() {
        assertTrue(test_computer.getMemory() == 8);
    }
}

