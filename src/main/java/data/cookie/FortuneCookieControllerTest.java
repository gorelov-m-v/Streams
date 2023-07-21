package data.cookie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static java.util.Collections.singletonList;

public class FortuneCookieControllerTest {

    FortuneCookieFactory fortuneCookieFactory;
    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;

    @BeforeAll
    public static void before() {
        goodFactoryController = new FortuneCookieController(
                new FortuneCookieFactory(
                        new FortuneConfig(true),
                        singletonList("positive"),
                        singletonList("negative")
                )
        );

        badFactoryController = new FortuneCookieController(
                new FortuneCookieFactory(
                        new FortuneConfig(false),
                        singletonList("positive"),
                        singletonList("negative")
                )
        );
    }

    @Test
    public void shouldReturnPositiveFortune() {
        String expectedFortune = "positive";

        Assertions.assertEquals(expectedFortune ,goodFactoryController.tellFortune().getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune () {
        String expectedFortune = "negative";

        Assertions.assertEquals(expectedFortune ,badFactoryController.tellFortune().getFortuneText());
    }
}
