import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AccountShould {

    @Mock TransationRepository transactionRepository;
    @Mock StatementPrinter statementPrinter;
    private Account account;

    @Before
    public void initialise() throws Exception {
        account = new Account(transactionRepository, statementPrinter);
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

    @Test
    public void print_a_statement() throws Exception {
        List<Transaction_> transactions = new ArrayList<Transaction_>();
        transactions.add(new Transaction_("12/05/2015",100));

        when(transactionRepository.allTransactions()).thenReturn(transactions);

        account.printStatement();

        verify(statementPrinter).print(transactions);
    }
}
