package practicum.sortaccount;

import java.util.Comparator;

class Account {
    private final String owner;
    private final long balance;
    private final boolean locked;

    Account(String owner, long balance, boolean locked) {
        this.owner = owner;
        this.balance = balance;
        this.locked = locked;
    }

    public static Comparator<Account> getComparatorByLockedBalanceAndOwner() {
        Comparator<Account> result = Comparator.comparing(Account::isLocked).reversed()
                .thenComparing(Account::getBalance).reversed()
                .thenComparing(Account::getOwner);

        return result;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return locked;
    }

    @Override
    public String toString() {
        return owner + " " + balance + " " + locked;
    }
}
