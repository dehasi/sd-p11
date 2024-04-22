package p3_few_events.application;

import p3_few_events.domain.BankAccountRepository;
import p3_few_events.domain.BankAccountService;
import p3_few_events.domain.CashMovementsService;
import p3_few_events.domain.DomainConfiguration;

import static p3_few_events.domain.DomainConfiguration.cashMovementsService;

public class ApplicationConfiguration {

    public static UserInputController userInputService() {
        BankAccountRepository repository = null;

        BankAccountService bankAccountService = DomainConfiguration.bankAccountService(repository);
        CashMovementsService cashMovementsService = cashMovementsService(repository);

        return new UserInputController(bankAccountService, cashMovementsService);
    }
}
