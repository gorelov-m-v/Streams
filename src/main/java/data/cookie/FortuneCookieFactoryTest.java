package data.cookie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;

public class FortuneCookieFactoryTest {
    FortuneCookieFactory factory;

    @BeforeEach
    public void before() {
        factory = new FortuneCookieFactory(
                new FortuneConfig(true),
                singletonList("positive"),
                singletonList("negative")
        );
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        int expectedCount = 1;

        factory.bakeFortuneCookie();

        Assertions.assertEquals(expectedCount, factory.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        int expectedCount = 2;

        factory.bakeFortuneCookie();
        factory.bakeFortuneCookie();

        Assertions.assertEquals(expectedCount, factory.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        int expectedCount = 0;
        factory.bakeFortuneCookie();

        factory.resetCookiesCreated();

        Assertions.assertEquals(expectedCount, factory.getCookiesBaked());
    }
}
