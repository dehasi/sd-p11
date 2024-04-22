package p2_introduce_events.application;

import p2_introduce_events.domain.BankAccountRepository;
import p2_introduce_events.domain.BankAccountService;

import static p2_introduce_events.domain.DomainConfiguration.bankAccountService;

public class ApplicationConfiguration {

    public static UserInputController userInputService() {
        BankAccountRepository repository = null; // TODO: implement repository

        BankAccountService bankAccountService = bankAccountService(repository);

        return new UserInputController(bankAccountService);
    }
}
