package p4_projection.application;

import p4_projection.domain.BankAccountRepository;
import p4_projection.domain.BankAccountService;
import p4_projection.domain.CashMovementsService;
import p4_projection.domain.DomainConfiguration;

import static p4_projection.domain.DomainConfiguration.bankAccountService;

public class ApplicationConfiguration {

    public static UserInputController userInputService() {
        BankAccountRepository repository = null;

        BankAccountService bankAccountService = bankAccountService(repository);
        CashMovementsService cashMovementsService = DomainConfiguration.cashMovementsService(repository);

        return new UserInputController(bankAccountService, cashMovementsService);
    }
}
