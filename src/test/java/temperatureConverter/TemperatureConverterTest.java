package temperatureConverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    // --- Celsius to Fahrenheit ---
    @Test
    void testCelsiusToFahrenheit_boilingPoint() {
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    void testCelsiusToFahrenheit_freezingPoint() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.01);
    }

    @Test
    void testCelsiusToFahrenheit_negative() {
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), 0.01);
    }

    // --- Fahrenheit to Celsius ---
    @Test
    void testFahrenheitToCelsius_boilingPoint() {
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    void testFahrenheitToCelsius_freezingPoint() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.01);
    }

    @Test
    void testFahrenheitToCelsius_bodyTemp() {
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.01);
    }

    // --- Celsius to Kelvin ---
    @Test
    void testCelsiusToKelvin_absoluteZero() {
        assertEquals(0.0, TemperatureConverter.celsiusToKelvin(-273.15), 0.01);
    }

    @Test
    void testCelsiusToKelvin_zero() {
        assertEquals(273.15, TemperatureConverter.celsiusToKelvin(0), 0.01);
    }

    // --- Kelvin to Celsius ---
    @Test
    void testKelvinToCelsius_300K() {
        assertEquals(26.85, TemperatureConverter.kelvinToCelsius(300), 0.01);
    }

    @Test
    void testKelvinToCelsius_zero() {
        assertEquals(-273.15, TemperatureConverter.kelvinToCelsius(0), 0.01);
    }

    @Test
    void testKelvinToCelsius_boilingPoint() {
        assertEquals(100.0, TemperatureConverter.kelvinToCelsius(373.15), 0.01);
    }

    // --- Fahrenheit to Kelvin ---
    @Test
    void testFahrenheitToKelvin_boilingPoint() {
        assertEquals(373.15, TemperatureConverter.fahrenheitToKelvin(212), 0.01);
    }

    @Test
    void testFahrenheitToKelvin_freezingPoint() {
        assertEquals(273.15, TemperatureConverter.fahrenheitToKelvin(32), 0.01);
    }

    // --- Kelvin to Fahrenheit ---
    @Test
    void testKelvinToFahrenheit_boilingPoint() {
        assertEquals(212.0, TemperatureConverter.kelvinToFahrenheit(373.15), 0.01);
    }

    @Test
    void testKelvinToFahrenheit_absoluteZero() {
        assertEquals(-459.67, TemperatureConverter.kelvinToFahrenheit(0), 0.01);
    }
}
