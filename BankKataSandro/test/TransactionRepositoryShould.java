
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


import java.util.List;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;



@RunWith(MockitoJUnitRunner.class)
public class TransactionRepositoryShould {


    public static final String TODAY = "12/05/2015";

    @Mock Clock clock;

    private TransationRepository transationRepository;

    @Before
    public void initialise() throws Exception {
        transationRepository = new TransationRepository(clock);

    }

    @Test
    public void create_a_store_a_deposit_transaction() throws Exception {
        when(clock.todayAsString()).thenReturn(TODAY);
        transationRepository.addDeposit(100);

        List<Transaction_> transactions = transationRepository.allTransactions();
        assertThat(transactions.size(),is(1));
        assertThat(transactions.get(0),is(transaction(TODAY, 100)));
    }

    @Test
    public void create_a_store_a_withdraw_transaction() throws Exception {
        when(clock.todayAsString()).thenReturn(TODAY);
        transationRepository.addWithdraw(100);

        List<Transaction_> transactions = transationRepository.allTransactions();
        assertThat(transactions.size(),is(1));
        assertThat(transactions.get(0),is(transaction(TODAY, -100)));

    }

    private Transaction_ transaction(String date, int amount) {
       return new Transaction_(date, amount);
    }
}
