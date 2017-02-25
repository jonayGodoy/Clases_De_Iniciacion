import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

public class AcceptanceTest {

    private AccountService account;
    private ConsoleBank consoleBank;
    private List<Transaction> transactionList;

    @Before
    public void setUp() throws Exception {
        Calendar calendar = mock(Calendar.class);
        transactionList = mock(List.class);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        when(calendar.currentDate())
                .thenReturn(
                        format.parse("01/04/2014"),
                        format.parse("02/04/2014"),
                        format.parse("10/04/2014")
                );


        consoleBank = mock(ConsoleBank.class);
        account = new AccountService(consoleBank, calendar,transactionList);

    }

    @Test
    public void should_print_statement_containing_all_transactions() throws ParseException {
        Transaction transaction1 = createTransaction(1000,1000,"01/04/2014");
        Transaction transaction2 = createTransaction(-100,900,"02/04/2014");
        Transaction transaction3 = createTransaction(500,1400,"10/04/2014");


        when(transactionList.get(0)).thenReturn(transaction1);
        when(transactionList.get(1)).thenReturn(transaction2);
        when(transactionList.get(2)).thenReturn(transaction3);
        when(transactionList.size()).thenReturn(3);


        account.deposit(1000);
        account.withdraw(100);
        account.deposit(500);
        account.printStatement();

        verify(consoleBank).printLine("DATE | AMOUNT | BALANCE");
        verify(consoleBank).printLine("10/04/2014 | 500 | 1400");
        verify(consoleBank).printLine("02/04/2014 | -100 | 900");
        verify(consoleBank).printLine("01/04/2014 | 1000 | 1000");
    }

    @Test
    public void printConsole_head_format() throws Exception {
        account.printStatement();
        verify(consoleBank).printLine("DATE | AMOUNT | BALANCE");
    }

    @Test
    public void account_deposite_1000_printStatement() throws Exception {
        Transaction transaction = createTransaction(1000,1000,"01/04/2014");

        when(transactionList.get(0)).thenReturn(transaction);
        when(transactionList.size()).thenReturn(1);


        account.deposit(1000);
        verify(transactionList).add(any(Transaction.class));
        account.printStatement();

        verify(consoleBank).printLine("DATE | AMOUNT | BALANCE");
        verify(consoleBank).printLine("01/04/2014 | 1000 | 1000");
    }

    @Test
    public void account_deposite_1000_withdraw_100_printStatement() throws Exception {
        Transaction transaction1 = createTransaction(1000,1000,"01/04/2014");
        Transaction transaction2 = createTransaction(-100,900,"02/04/2014");

        when(transactionList.get(0)).thenReturn(transaction1);
        when(transactionList.get(1)).thenReturn(transaction2);
        when(transactionList.size()).thenReturn(2);


        account.deposit(1000);
        account.withdraw(100);
        verify(transactionList,times(2)).add(any(Transaction.class));

        account.printStatement();

        verify(consoleBank).printLine("DATE | AMOUNT | BALANCE");
        verify(consoleBank).printLine("02/04/2014 | -100 | 900");
        verify(consoleBank).printLine("01/04/2014 | 1000 | 1000");

    }

    @Test
    public void should_print_statement_containing_all_transactions_verify_account() throws ParseException {
        Transaction transaction1 = createTransaction(1000,1000,"01/04/2014");
        Transaction transaction2 = createTransaction(-100,900,"02/04/2014");
        Transaction transaction3 = createTransaction(500,1400,"10/04/2014");


        when(transactionList.get(0)).thenReturn(transaction1);
        when(transactionList.get(1)).thenReturn(transaction2);
        when(transactionList.get(2)).thenReturn(transaction3);
        when(transactionList.size()).thenReturn(3);

        account.deposit(1000);
        account.withdraw(100);
        account.deposit(500);
        account.printStatement();

        verify(transactionList,times(3)).add(any(Transaction.class));

        verify(consoleBank).printLine("DATE | AMOUNT | BALANCE");
        verify(consoleBank).printLine("10/04/2014 | 500 | 1400");
        verify(consoleBank).printLine("02/04/2014 | -100 | 900");
        verify(consoleBank).printLine("01/04/2014 | 1000 | 1000");
    }


    private Transaction createTransaction(int amount,int balance,String dateString) {
        Transaction transaction = mock(Transaction.class);
        when(transaction.getAmount()).thenReturn(amount);
        when(transaction.getBalance()).thenReturn(balance);
        Date date = mock(Date.class);
        when(date.toString()).thenReturn(dateString);
        when(transaction.getDate()).thenReturn(date);
        return transaction;
    }

}
