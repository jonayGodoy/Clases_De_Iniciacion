import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StatementPrinter {


    public static final String STATEMENT_HEADER = "DATE | AMOUNT | BALANCE";
    private DecimalFormat decimalFormatter = new DecimalFormat("#.00");

    private Console_ console;

    public StatementPrinter(Console_ console) {

        this.console = console;
    }

    public void print(List<Transaction_> transactions) {
        console.printLine(STATEMENT_HEADER);

        printStatementLine(transactions);

    }

    private void printStatementLine(List<Transaction_> transactions) {
        AtomicInteger runningBalance = new AtomicInteger();

        List<String> lineStatements = new ArrayList<>();
        for (Transaction_ transaction: transactions) {
            lineStatements.add(statementLine(transaction, runningBalance));
        }


        ListIterator<String> iter = lineStatements.listIterator(lineStatements.size());
        while (iter.hasPrevious()){
         //   System.out.println(iter.previous());
            console.printLine(iter.previous());
        }


        /*
        transactions.stream()
                    .map(transaction -> statementLine(transaction, runningBalance))
                    .collect(Collectors.toCollection(LinkedList::new))
                    .descendingIterator()
                    .forEachRemaining(console::printLine);
         */
    }

    private String statementLine(Transaction_ transaction, AtomicInteger runningBalance) {
        return transaction.date()
                +" | "
                + decimalFormatter.format(transaction.amount())
                +" | "
                + decimalFormatter.format(runningBalance.addAndGet(transaction.amount()));
    }

}
