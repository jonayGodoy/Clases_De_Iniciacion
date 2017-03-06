
public class BankKataAplication {

    public static void main(String [] args){
        Clock clock = new Clock();
        TransationRepository  transationRepository = new TransationRepository(clock);
        Console_ console = new Console_();
        StatementPrinter statementPrinter = new StatementPrinter(console);
        Account account = new Account(transationRepository,statementPrinter);

        account.deposit(1000);
        account.withdraw(-100);
        account.deposit(100);

        account.printStatement();

    }

}
