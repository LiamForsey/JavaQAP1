public class TestAccount {
    public static void main(String[] args) {
        
        Account Account1 = new Account("1", "Liam", 2500);
        Account Account2 = new Account("2", "Rhonda", 4500);

        System.out.println("");
        
        System.out.println("Initial balances:");
        System.out.println("Account 1: $" + Account1.getBalance());
        System.out.println("Account 2: $" + Account2.getBalance());

        Account2.transferTo(Account1, 1000);

        System.out.println("\nBalances after transfer:");
        System.out.println("Account 1: $" + Account1.getBalance());
        System.out.println("Account 2: $" + Account2.getBalance());
    }
}