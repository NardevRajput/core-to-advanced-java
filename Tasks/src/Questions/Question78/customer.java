package Questions.Question78;

public class customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("987654", "nardev");
        account.depositMoney(1000);
        System.out.println(account.withdrawMoney(5000));
        account.depositMoney(-40);
        account.withdrawMoney(0);

    }
}
