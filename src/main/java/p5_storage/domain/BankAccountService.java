package p5_storage.domain;

public class BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountService(BankAccountRepository repository) {this.repository = repository;}

    public void create(int id) {
        // TIP: You can copy-paste implementation from the previous step
    }

    public int balance(int id) {
        return repository.findById(id).balance;
    }

    // TIP: You can copy-paste implementation from the previous step
    public void deposit(int id, int amount) {
        BankAccount account = repository.findById(id);

        account.deposit(amount);

        repository.save(account);
    }

    public void withdraw(int id, int amount) {
        BankAccount account = repository.findById(id);

        account.withdraw(amount);

        repository.save(account);
    }

    public void fee(int id, int amount) {
        BankAccount account = repository.findById(id);

        account.fee(amount);

        repository.save(account);
    }
}
