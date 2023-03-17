public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);
        System.out.printf("Your balance BEFORE is: %d%n", account.getTotal());

        // TODO : create and use a TransactionListener interface with onComplete method
        Transactions.withdraw(account, 100, new TransactionListener());

        System.out.printf("Your balance AFTER is: %d%n", account.getTotal());
    }
}
