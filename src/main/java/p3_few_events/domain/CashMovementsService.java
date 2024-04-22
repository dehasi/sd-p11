package p3_few_events.domain;

import java.util.ArrayList;
import java.util.List;

public class CashMovementsService {

    private final BankAccountRepository repository;

    public CashMovementsService(BankAccountRepository repository) {this.repository = repository;}

    public List<String> history(int id) {
        var events = repository.allEventsFor(id);
        List<String> history = new ArrayList<>();
        // TIP: You can copy-paste implementation from the previous step
        return history;
    }
}
