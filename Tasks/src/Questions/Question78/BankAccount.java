package Questions.Question78;

class BankAccount {
    private String accountNumber;
    private String AccountHolderName;
    private double amount;

    public BankAccount(String accountNumber, String AccountHolderName){
        this.accountNumber = accountNumber;
        this.AccountHolderName = AccountHolderName;
    }

    public void depositMoney(double money){
        if (money <= 0){
            System.out.println("Invalid deposit");
        } else {
            amount += money;
        }
    }
    double withdrawMoney(double money){
        if (money <= 0){
            System.out.println("Invalid widthdraw");
        }
        else if (amount >= money){
            amount -= money;
        }else{
            money = amount;
            return money;
        }
        return money;
    }
}
