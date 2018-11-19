import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import static org.junit.Assert.assertThat;

public class AssertThatBuildInMatchers {

    @Test
    public void lessthanOrEquals_custom_matcher() throws Exception{
        int actualage=42;
        assertThat(actualage, LessThanOrEqual.lessThanOrEqual(45));
        assertThat(actualage,LessThanOrEqual.lessThanOrEqual(42));

        double actualPI=3.14;
        assertThat(actualPI,LessThanOrEqual.lessThanOrEqual(3.1415));
        assertThat(actualPI,LessThanOrEqual.lessThanOrEqual(3.14));

        String actualName="Sun";
        assertThat(actualName,LessThanOrEqual.lessThanOrEqual("Ying"));
        assertThat(actualName,LessThanOrEqual.lessThanOrEqual("Sun"));
    }

    @Test
    public void compare_with_Maximum_Value() throws Exception{
        int actual_max=Integer.MAX_VALUE+1;
        assertThat(actual_max,LessThanOrEqual.lessThanOrEqual(Integer.MAX_VALUE));
    }

    @Test
    public void compare_with_Minimal_Value() throws Exception{
        int actual_min=Integer.MIN_VALUE+1;
        assertThat(actual_min,LessThanOrEqual.lessThanOrEqual(Integer.MIN_VALUE));
    }

}
