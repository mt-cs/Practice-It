public class MinMaxAccount extends BankingAccount {
    private int min, max;

    public MinMaxAccount(Startup s) {
        super(s);
        min = max = getBalance();
    }

    public void credit(Credit c) {
        super.credit(c);
        update();
    }

    public void debit(Debit d) {
        super.debit(d);
        update();
    }

    public void update() {
        int balance = getBalance();
        if (balance < min) {
            min = balance;
        } else if (balance > max) {
            max = balance;
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
