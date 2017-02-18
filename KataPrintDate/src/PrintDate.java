import java.util.Date;

public class PrintDate {


    private Console console;
    private DateOwn dateOwn;

    public PrintDate( Console console, DateOwn dateOwn) {
        this.console = console;
        this.dateOwn = dateOwn;
    }

    public void printCurrentDate() {
        this.console.print(this.dateOwn);
    }
}