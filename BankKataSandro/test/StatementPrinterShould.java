import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class StatementPrinterShould {

    private static final List<Transaction_> NO_TRANSATIONS = Collections.EMPTY_LIST;

    @Mock Console_ console;
    private StatementPrinter statementPrinter;

    @Before
    public void initilise() throws Exception {
        statementPrinter = new StatementPrinter(console);

    }

    @Test
    public void always_print_the_header() throws Exception {
        statementPrinter.print(NO_TRANSATIONS);

        verify(console).printLine("DATE | AMOUNT | BALANCE");
    }

    @Test
    public void print_transactions_in_reverse_chronological_order() throws Exception {
        List<Transaction_> transactions = transactionsContaing(
                                            deposit("01/04/2014", 1000),
                                            withdrawal("02/04/2014", 100),
                                            deposit("10/04/2014", 500));

        statementPrinter.print(transactions);

        InOrder InOrder = Mockito.inOrder(console);
        InOrder.verify(console).printLine("DATE | AMOUNT | BALANCE");
        InOrder.verify(console).printLine("10/04/2014 | 500,00 | 1400,00");
        InOrder.verify(console).printLine("02/04/2014 | -100,00 | 900,00");
        InOrder.verify(console).printLine("01/04/2014 | 1000,00 | 1000,00");
    }

    private List<Transaction_> transactionsContaing(Transaction_... transactions) {
        return  Arrays.asList(transactions);
    }

    private Transaction_ withdrawal(String date, int amount) {
        return new Transaction_(date,-amount);
    }

    private Transaction_ deposit(String date, int amount) {
        return new Transaction_(date,amount);
    }
}
