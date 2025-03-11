package contornos.ud3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit0() {
    
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0));
    }

    @Test
    public void testCelsiusToFahrenheitPositivo() {

        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100.0));
    }

    @Test
    public void testCelsiusToFahrenheitNegativo() {

        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40.0));
    }

    @Test
    public void testCelsiusToFahrenheitTemperaturaArbitraria() {

        assertEquals(77.0, TemperatureConverter.celsiusToFahrenheit(25.0));
    }

    @Test
    public void testCelsiusToFahrenheitTemperaturaBaja() {

        assertEquals(-148.0, TemperatureConverter.celsiusToFahrenheit(-100.0));
    }
}

