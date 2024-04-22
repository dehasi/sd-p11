package p2_introduce_events.domain;

public class BankAccount {
    public int id;
    public int balance;

    public BankAccount(Object events) {
        // TODO build BankAccount from events
        // TIP: it's convenient to have 'apply' method that accepts "abstract" event
        // and calls a particular 'when' method depending on event type or name
        // If ^^^^ it sounds confusing, just ignore ;)
    }

    public Object deposit(int amount) {
        assert amount > 0;
        return null;
    }

    public Object withdraw(int amount) {
        assert amount > 0;
        return null;
    }

    // TIP: we need a separate method for 'fee'
    public Object fee(int amount) {
        assert amount > 0;
        return null;
    }
}
