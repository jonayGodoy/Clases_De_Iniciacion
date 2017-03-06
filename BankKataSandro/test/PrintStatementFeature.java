import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrintStatementFeature {


    @Mock Console_ console;
    @Mock Clock clock;


    private Account account;

    @Before
    public void initialise() throws Exception {
        TransationRepository transationRepository = new TransationRepository(clock);
        StatementPrinter statementPrinter = new StatementPrinter(console);
        account = new Account(transationRepository, statementPrinter);

    }

    @Test
    public void print_statement_containing_all_transactions() throws Exception {
        when(clock.todayAsString()).thenReturn("01/04/2014","02/04/2014","10/04/2014");

        account.deposit(1000);
        account.withdraw(100);
        account.deposit(500);

        account.printStatement();

        InOrder InOrder = Mockito.inOrder(console);
        InOrder.verify(console).printLine("DATE | AMOUNT | BALANCE");
        InOrder.verify(console).printLine("10/04/2014 | 500,00 | 1400,00");
        InOrder.verify(console).printLine("02/04/2014 | -100,00 | 900,00");
        InOrder.verify(console).printLine("01/04/2014 | 1000,00 | 1000,00");
    }
}