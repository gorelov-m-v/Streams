package data.transport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldReturnValidPriceWhenBikeAndDistanceIs15Km() {
        int distance = 15;
        int expectedPrice = 150;

        int actualPrice = priceCalculator.calculatePrice(TransportType.BIKE, distance);

        Assertions.assertEquals(actualPrice, expectedPrice);
    }

    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceIs0Km() {
        int distance = 0;

        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, distance)
        );

        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenBikeAndDistanceIs25Km() {
        int distance = 25;

        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.BIKE, distance)
        );

        Assertions.assertEquals("Bike can not go for more than 20 km", ex.getMessage());
    }

    @Test
    public void shouldReturnValidPriceWhenTruckAndDistanceIs15Km() {
        int distance = 15;
        int expectedPrice = 75;

        int actualPrice = priceCalculator.calculatePrice(TransportType.TRUCK, distance);

        Assertions.assertEquals(actualPrice, expectedPrice);
    }

    @Test
    public void shouldThrowExceptionWhenTruckAndDistanceIs0Km() {
        int distance = 0;

        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.TRUCK, distance)
        );

        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldReturnValidPriceWhenCarAndDistanceIs15Km() {
        int distance = 15;
        int expectedPrice = 105;

        int actualPrice = priceCalculator.calculatePrice(TransportType.CAR, distance);

        Assertions.assertEquals(actualPrice, expectedPrice);
    }

    @Test
    public void shouldThrowExceptionWhenCarAndDistanceIs0Km() {
        int distance = 0;

        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, distance)
        );

        Assertions.assertEquals("Distance should be more than 0 km", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenCarAndDistanceIs1001Km() {
        int distance = 1001;

        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                generateExecutable(TransportType.CAR, distance)
        );

        Assertions.assertEquals("Car can not go for more than 1000 km", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenDrone() {
        int distance = 1001;

        UnsupportedOperationException ex = Assertions.assertThrows(
                UnsupportedOperationException.class,
                generateExecutable(TransportType.DRONE, distance)
        );

        Assertions.assertEquals("transport type 'DRONE' is not handled correctly", ex.getMessage());
    }





    private Executable generateExecutable(TransportType type, int distance) {
        return () -> priceCalculator.calculatePrice(type, distance);
    }
}