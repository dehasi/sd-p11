package p4_projection.domain;

import p4_projection.domain.events.*;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    public int id;
    public int balance;

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
