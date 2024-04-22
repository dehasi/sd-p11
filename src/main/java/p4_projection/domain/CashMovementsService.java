package p4_projection.domain;

import java.util.ArrayList;
import java.util.List;

public class CashMovementsService {

    private final BankAccountRepository repository;

    public CashMovementsService(BankAccountRepository repository) {this.repository = repository;}

    public List<String> history(int id) {
        var events = repository.events(id);
        List<String> history = new ArrayList<>();
        // TIP: You can copy-paste implementation from the previous step
        return history;
    }

    public String summary(int id) {
        var events = repository.events(id);
        int deposit = 0, withdrawal = 0, fee = 0;
        // TODO: Implement
        return String.format("id: %s\ntotal deposited: $%s\ntotal withdrew: $%s\ntotal fees: $%s",
                id, deposit, withdrawal, fee);
    }
}
