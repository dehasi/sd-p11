package p3_few_events.domain;

public class BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountService(BankAccountRepository repository) {this.repository = repository;}

    public void create(int id) {
        // TODO: save BankAccount, here and below, repository can take care of events
    }

    public int balance(int id) {
        return repository.findById(id).balance;
    }

    public void deposit(int id, int amount) {
        BankAccount account = repository.findById(id);

        account.deposit(amount);
        // TODO: save BankAccount, here and below
    }

    public void withdraw(int id, int amount) {
        BankAccount account = repository.findById(id);

        account.withdraw(amount);
    }

    public void fee(int id, int amount) {
        BankAccount account = repository.findById(id);

        account.fee(amount);
    }
}
