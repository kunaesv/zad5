class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public void withdrawAll() {
        long withdrawnAmount = moneyAmount;
        moneyAmount = 0;
        System.out.println("Со счёта снято " + withdrawnAmount + " р.");
    }
}