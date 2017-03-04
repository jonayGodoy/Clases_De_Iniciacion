
public class Account {

    private TransationRepository transationRepository;

    public Account(TransationRepository transactionRepository) {
        this.transationRepository = transactionRepository;
    }

    public void deposit(int amount) {
        transationRepository.addDeposit(amount);
    }

    public void withdraw(int amount) {
        transationRepository.addWithdraw(amount);
    }

    public void printStatement() {

    }
}
