import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62, 1.72);
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear.getWeight(), 0.01);
    }

    @Test
    public void hasHeight(){
        assertEquals(1.72, bear.getHeight(), 0.01);
    }

    @Test
    public void readyToHibernateIfBMIGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfBMIGreaterThan80(){
        Bear thinBear = new Bear("Yogi", 30, 65.44, 17.22);
        assertEquals(false, thinBear.readyToHibernate());
    }

    @Test
    public void hasBMI(){
        assertEquals(32.32,bear.getBMI(), 0.01);
    }

}
