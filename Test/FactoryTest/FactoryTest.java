package FactoryTest;

import Factory.Factory;
import Factory.WinFactory;
import Factory.Button;
import Factory.WinButton;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FactoryTest {
    @Test
    public void testFactory1(){
        Factory factory = new WinFactory();
        Button button = factory.createButton();
        assertNotNull(button);
    }
}
