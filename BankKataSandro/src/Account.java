
public class Account {

    private TransationRepository transationRepository;
    private StatementPrinter statementPrinter;

    public Account(TransationRepository transactionRepository, StatementPrinter statementPrinter) {
        this.transationRepository = transactionRepository;
        this.statementPrinter = statementPrinter;
    }

    public void deposit(int amount) {
        transationRepository.addDeposit(amount);
    }

    public void withdraw(int amount) {
        transationRepository.addWithdraw(amount);
    }

    public void printStatement() {
        statementPrinter.print(transationRepository.allTransactions());
    }
}
