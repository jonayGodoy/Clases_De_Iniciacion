import org.junit.Assert;
import org.junit.Test;

public class PrintDateShouldDirect {

    @Test
    public void printDate() throws Exception {
        CallPrintDate printDate = new CallPrintDate();

        printDate.currentDate();

        Assert.assertTrue(printDate.isCalled());
    }
}
