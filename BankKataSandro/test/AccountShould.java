import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AccountShould {

    @Mock TransationRepository transactionRepository;
    private Account account;

    @Before
    public void initialise() throws Exception {
        account = new Account(transactionRepository);

    }

    @Test
    public void store_a_deposit_transaction() throws Exception {
        account.deposit(100);

        verify(transactionRepository).addDeposit(100);
    }

    @Test
    public void store_a_withdrawal_transaction() throws Exception {
        account.withdraw(100);

        verify(transactionRepository).addWithdraw(100);
    }
}
