package p2_introduce_events.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static p2_introduce_events.domain.DomainConfiguration.bankAccountService;
import static p2_introduce_events.domain.DomainConfiguration.cashMovementsService;

@Disabled("TODO: Make test pass")
class CashMovementsServiceTest {

    final BankAccountRepository repository = null;
    final BankAccountService bankAccountService = bankAccountService(repository);
    final CashMovementsService cashMovementsService = cashMovementsService(repository);

    @Test void history() {
        final int id = 42;
        bankAccountService.create(id);
        bankAccountService.deposit(id, 50);
        bankAccountService.withdraw(id, 9);
        bankAccountService.fee(id, 4);

        List<String> history = cashMovementsService.history(id);

        assertThat(history).containsExactly(
                "created, id:42",
                "deposited: $50",
                "withdrew: $9",
                "fee: $4");
    }
}