package p5_storage.domain;

import p5_storage.domain.events.*;

import java.util.ArrayList;
import java.util.List;

public class CashMovementsService {

    private final BankAccountRepository repository;

    public CashMovementsService(BankAccountRepository repository) {this.repository = repository;}

    public List<String> history(int id) {
        // TIP: You can copy-paste implementation from the previous step
        return null;
    }

    public String summary(int id) {
        // TIP: You can copy-paste implementation from the previous step
        return null;
    }
}
