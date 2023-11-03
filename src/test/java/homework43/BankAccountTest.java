package homework43;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class BankAccountTest {
        @Test
        public void testDeposit() {
            BankAccount account = new BankAccount("Владелец1", 1000.0);
            account.deposit(500.0);
            assertEquals(1500.0, account.getBalance(), 0.01); // Проверка, что баланс увеличился на 500.0
        }

        @Test
        public void testWithdraw() {
            BankAccount account = new BankAccount("Владелец1", 1000.0);
            account.withdraw(500.0);
            assertEquals(500.0, account.getBalance(), 0.01); // Проверка, что баланс уменьшился на 500.0
        }
    }

