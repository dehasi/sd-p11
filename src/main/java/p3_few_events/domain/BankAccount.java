package p3_few_events.domain;

public class BankAccount {

    public int id;
    public int balance;
    // TODO: keep events as a state

    public BankAccount(Object events) {
        // TIP: You can copy-paste implementation from the previous step
    }

    public void deposit(int amount) {
        assert amount > 0;
        // TODO: Sometimes you have to "fire" two events here
        // TIP: It's convenient to have a method that applies an event (i.e. calls 'apply') and saves the event
        // Again, if the ^^^^ tip is confusing, just ignore
    }

    public void withdraw(int amount) {
        assert amount > 0;
    }

    public void fee(int amount) {
        assert amount > 0;
    }

}
