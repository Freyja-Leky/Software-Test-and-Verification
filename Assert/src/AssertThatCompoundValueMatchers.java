import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class AssertThatCompoundValueMatchers {

    @Test
    public void vertify_multiple_valuew() throws  Exception{
        double marks=100.0;
        assertThat(marks,either(equalTo(100.00)).or(equalTo(90.9)));
        assertThat(marks,both(not(99.99)).and(not(60.00)));
        assertThat(marks,anyOf(equalTo(100.00),equalTo(1.00),equalTo(55.00)));
        assertThat(marks,not(anyOf(equalTo(0.00),equalTo(200.00))));
        assertThat(marks,not(allOf(equalTo(1.00),equalTo(100.00),equalTo(30.00))));
    }
}
