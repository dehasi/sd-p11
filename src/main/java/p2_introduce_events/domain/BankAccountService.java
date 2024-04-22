package p2_introduce_events.domain;

public class BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountService(BankAccountRepository repository) {this.repository = repository;}

    public void create(int id) {
        // TODO: save event, here and below
    }

    public int balance(int id) {
        return repository.findById(id).balance;
    }

    public void deposit(int id, int amount) {
        BankAccount account = repository.findById(id);
    }

    public void withdraw(int id, int amount) {
        BankAccount account = repository.findById(id);
    }

    public void fee(int id, int amount) {
        BankAccount account = repository.findById(id);
    }
}
