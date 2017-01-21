
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class HelloShould {

    @Test
    public void testGreen() {
        Assert.assertTrue(true);
    }


    @Test
    public void testThat() {
        assertThat(true, is(true));
    }


    @Test
    public void helloIsHello() {
        String hello = "Hello World";
        Assert.assertEquals("Hello World",hello);
    }
}