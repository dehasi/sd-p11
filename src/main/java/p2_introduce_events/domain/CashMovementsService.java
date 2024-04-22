package p2_introduce_events.domain;

import java.util.ArrayList;
import java.util.List;

public class CashMovementsService {

    private final BankAccountRepository repository;

    public CashMovementsService(BankAccountRepository repository) {this.repository = repository;}

    public List<String> history(int id) {
        var events = repository.allEventsFor(id);
        List<String> history = new ArrayList<>();
        // TODO: Implement
        return history;
    }
}
