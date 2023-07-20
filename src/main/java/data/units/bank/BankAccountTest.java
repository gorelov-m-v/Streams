package data.units.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(new Integer(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled() {
        BankAccount account = new BankAccount("a", "b");
        boolean expectedIsBlocked = true;

        account.block();

        Assertions.assertEquals(expectedIsBlocked,account.isBlocked());
    }

    @Test
    public void shouldReturnFirstNameThenSecondName() {
        BankAccount account = new BankAccount("a", "b");
        String[] expectedArray = new String[] {"a", "b"};

        Assertions.assertArrayEquals(expectedArray, account.getFullName());
    }

    @Test
    public void shouldReturnNullAmountWhenNotActive() {
        BankAccount account = new BankAccount("a", "b");


        Assertions.assertNull(account.getCurrency());

        Assertions.assertThrows(
                IllegalStateException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        account.getAmount();
                    }
                });
    }
}
