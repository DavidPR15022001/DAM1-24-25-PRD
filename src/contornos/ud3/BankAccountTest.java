package contornos.ud3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(100.0);
    }

    @Test
    public void testInitialBalance() {

        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDeposit() {

        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() {

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0);
        });
    }

    @Test
    public void testDepositNegativeAmount() {

        account.deposit(-50.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testMultipleDepositsAndWithdrawals() {

        account.deposit(200.0);
        account.withdraw(150.0);
        account.deposit(50.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }
}

