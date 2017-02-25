public class CallPrintDate extends PrintDateDirect {

    private boolean Call = false;

    private PrintDateDirect printDate = new PrintDateDirect();

    public boolean isCalled() {
        return Call;
    }

    public void currentDate() {

        Call = true;

        printDate.currentDate();
    }
}
