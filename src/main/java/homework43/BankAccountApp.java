package homework43;

public class BankAccountApp {
    public static void main(String[] args) {
        // Пример использования класса BankAccount
        BankAccount account = new BankAccount("Владелец1", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        double balance = account.checkBalance();
        System.out.println("Баланс: " + balance);
    }
}
