package temperatureConverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    @Test
    void testKelvinToCelsius() {
        assertEquals(26.85, TemperatureConverter.kelvinToCelsius(300), 0.01);
        assertEquals(0.0, TemperatureConverter.kelvinToCelsius(273.15), 0.01);
        assertEquals(-273.15, TemperatureConverter.kelvinToCelsius(0), 0.01);
    }
}
