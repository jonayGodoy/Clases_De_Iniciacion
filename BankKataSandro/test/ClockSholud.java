import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClockSholud {

    @Test
    public void returns_todays_date_in_dd_MM_yyyy_format() throws Exception {
        Clock clock = new TestAsClock();

        String date = clock.todayAsString();

        assertThat(date,is("24/04/2015"));
    }

    private class TestAsClock extends Clock {
        @Override
        protected LocalDate today() {
            return LocalDate.of(2015,4,24);
        }
    }
}
