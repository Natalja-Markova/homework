package homework43;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            LOGGER.error("Сумма не может быть отрицательной или равной 0");
            return; // Нет необходимости продолжать выполнение метода, если сумма некорректна
        }
        balance = balance + amount;
        LOGGER.info("Вы внесли на счет владельца {} {} евро. На вашем счете {} евро.", owner, amount, balance);
    }

    public void withdraw(double amount) {
        if (checkBankAccount(amount)) {
            balance = balance - amount;
            LOGGER.info("Вы сняли со счета {} {} евро. На вашем счете {} евро.", owner, amount, balance);
        } else {
            LOGGER.error("На вашем счете {} недостаточно средств для снятия {} евро или превышен лимит на снятие денег", owner, balance);
        }
    }

    private boolean checkBankAccount(double amount) {
        return amount <= balance;
    }

    public double checkBalance() {
        LOGGER.debug("Баланс владельца {}: {}", owner, balance);
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
