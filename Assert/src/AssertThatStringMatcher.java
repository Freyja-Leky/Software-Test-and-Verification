import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class AssertThatStringMatcher {

    @Test
    public void vertify_Strings() throws Exception{
        String name="Sun Hai Ying";

        assertThat(name,startsWith("Su"));
        assertThat(name,endsWith("ng"));
        assertThat(name,containsString("Hai"));
    }
}
