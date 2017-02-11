import junit.framework.Assert;
import org.junit.Test;

public class PassShould {

    @Test
    public void  ssss() throws Exception {
        Password pwd = new Password();
        boolean  isGreater = pwd.validate("xxxxxxAb_1");

        Assert.assertTrue(isGreater);
    }

    @Test
    public void passGreaterThan6() throws Exception {
        Password pwd = new Password();
        boolean  isGreater = pwd.validate("xxAb_1");

        Assert.assertFalse(isGreater);
    }

    @Test
    public void passValidateUpperCase() throws Exception {
       Password pwd = new Password();
       boolean  isUpperCase = pwd.validate("aaaaaaaa");

       Assert.assertFalse(isUpperCase);
    }

}
