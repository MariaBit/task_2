import org.testng.Assert;
import org.testng.annotations.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber()
    {
        int actual = this.getClassNumber();

        Assert.assertTrue(actual > 45, "Число меньше 45, а должно быть больше 45!");

    }
}
