import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

public class PrintDateShould {


    @Test
    public void printDate() throws Exception {
        ConsoleMock console = new ConsoleMock();
        DateOwnStub date = new DateOwnStub();
        PrintDate printDate = new PrintDate(console,date);

        printDate.printCurrentDate();

        Assert.assertTrue(console.isVerify());
    }

    @Test
    public void printDateMockitoMock() throws Exception {
        Console consoleMock = mock(Console.class);

        DateOwnStub date = new DateOwnStub();

        PrintDate printDate = new PrintDate(consoleMock,date);
        printDate.printCurrentDate();

        verify(consoleMock, times(1)).print(date);
    }

    @Test
    public void printDateMockitoStub() throws Exception {
        DateOwn date = mock(DateOwn.class);
        String datePrint = "Sat Feb 18 05:27:14 GMT 2017 dia de jonay";
        when(date.toString()).thenReturn("Sat Feb 18 05:27:14 GMT 2017 dia de jonay");

        Assert.assertThat(datePrint,is(date.toString()));
    }


}