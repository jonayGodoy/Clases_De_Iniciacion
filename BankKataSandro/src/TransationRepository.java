import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransationRepository {

    private final Clock clock;
    private List<Transaction_> transactions = new ArrayList<>();

    public TransationRepository(Clock clock) {
        this.clock = clock;
    }

    public void addDeposit(int amount)
    {
        Transaction_ depositTransaction = new Transaction_(clock.todayAsString(), amount);
        transactions.add(depositTransaction);
    }

    public void addWithdraw(int amount)
    {
        Transaction_ withDrawAll = new Transaction_(clock.todayAsString(), -amount);
        transactions.add(withDrawAll);
    }

    public List<Transaction_> allTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}
