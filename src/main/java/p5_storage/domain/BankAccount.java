package p5_storage.domain;

import p5_storage.domain.events.*;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    public int id;
    public int balance;
    public List<DomainEvent> events = new ArrayList<>();

    // TIP: You can copy-paste implementation from the previous step

    public void deposit(int amount) {
        assert amount > 0;
    }

    public void withdraw(int amount) {
        assert amount > 0;
    }

    public void fee(int amount) {
        assert amount > 0;
    }
}
