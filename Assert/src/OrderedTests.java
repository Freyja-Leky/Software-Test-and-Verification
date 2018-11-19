import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)
public class OrderedTests {

    @Test
    public void edit()throws Exception{
        System.out.println("Edit executed");
    }

    @Test
    public void create()throws Exception{
        System.out.println("Create executed");
    }

    @Test
    public void remove()throws Exception{
        System.out.println("Remove executed");
    }
}
