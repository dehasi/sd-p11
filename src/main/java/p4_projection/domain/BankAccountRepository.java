package p4_projection.domain;

public interface BankAccountRepository {

    void save(BankAccount bankAccount);

    BankAccount findById(int id);

    Object events(int id);
    // TIP: You can copy-paste implementation from the previous step
}
