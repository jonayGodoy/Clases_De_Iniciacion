import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private ConsoleBank consoleBank;
    private Calendar clock;
    private List<Transaction> transactionList;

    public AccountService(ConsoleBank consoleBank, Calendar clock,List<Transaction> transactionList) {
        this.consoleBank = consoleBank;
        this.clock = clock;
        this.transactionList = transactionList;
    }

    public void deposit(int amount) {
        createTransaction(amount);
    }

    public void withdraw(int amount) {
        createTransaction(-(amount));
    }

    private void createTransaction(int amount) {
        transactionList.add(new Transaction(amount,amount,clock.currentDate()));
    }

    public void printStatement() {
        consoleBank.printLine("DATE | AMOUNT | BALANCE");

        for(int i = transactionList.size() -1;i >= 0;i--){
            Transaction transaction = transactionList.get(i);
            consoleBank.printLine(transaction.getDate().toString()+" | "+transaction.getAmount()+" | "+transaction.getBalance());
        }

    }
}