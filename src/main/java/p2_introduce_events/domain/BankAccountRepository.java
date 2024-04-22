package p2_introduce_events.domain;

public interface BankAccountRepository {

    BankAccount findById(int id);

    Object allEventsFor(int id);

    // TIP: feel free to add the necessary methods
}
