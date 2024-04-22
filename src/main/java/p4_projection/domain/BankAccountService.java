package p4_projection.domain;

public class BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountService(BankAccountRepository repository) {this.repository = repository;}

    public void create(int id) {
        // TIP: You can copy-paste implementation from the previous step
    }

    public int balance(int id) {
        return repository.findById(id).balance;
    }

    public void deposit(int id, int amount) {
        // TIP: You can copy-paste implementation from the previous step
    }

    public void withdraw(int id, int amount) {
        // TIP: You can copy-paste implementation from the previous step
    }

    public void fee(int id, int amount) {
        // TIP: You can copy-paste implementation from the previous step
    }
}
