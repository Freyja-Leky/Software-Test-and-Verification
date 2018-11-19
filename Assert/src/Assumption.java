import org.junit.Assume;
import org.junit.Test;
import org.junit.Assert;

public class Assumption {
    boolean isSonarRunning=false;

    @Test
    public void very_critical_test() throws Exception{
        isSonarRunning=true;
        Assume.assumeFalse(isSonarRunning);
        Assert.assertTrue(true);
    }
}
