package p3_few_events.domain;

public interface BankAccountRepository {

    void save(BankAccount bankAccount);

    BankAccount findById(int id);

    Object allEventsFor(int id);
    // TIP: feel free to add the necessary methods
    // TODO: Implement repository
}
