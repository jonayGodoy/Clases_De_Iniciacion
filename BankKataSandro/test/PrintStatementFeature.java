import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PrintStatementFeature {


    @Mock Console console;
    private Account account;

    @Before
    public void initialise() throws Exception {
        TransationRepository transationRepository = new TransationRepository();
        account = new Account(transationRepository );

    }

    @Test
    public void print_statement_containing_all_transactions() throws Exception {

        
        account.deposit(1000);
        account.withdraw(100);
        account.deposit(500);

        account.printStatement();


        InOrder InOrder = Mockito.inOrder(console);
        InOrder.verify(console).printLine("DATE      | AMOUNT  | BALANCE");
        InOrder.verify(console).printLine("10/04/2014| 500.00  | 1400.00");
        InOrder.verify(console).printLine("02/04/2014| -100.00 | 900.00");
        InOrder.verify(console).printLine("01/04/2014| 1000.00 | 1000.00");

    }
}