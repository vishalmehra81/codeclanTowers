import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest( "Jack", 23);
    }
    @Test
    public void hasName(){
        assertEquals("Jack", guest.getName());
    }
    @Test
    public void hasAge(){
        assertEquals(23,guest.getAge());
    }
}
