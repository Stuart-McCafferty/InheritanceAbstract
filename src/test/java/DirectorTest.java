import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void SetUp(){
        director = new Director("Keith", 12345, 30000.00, "CodeClan", 10000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Keith", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(12345, director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("CodeClan", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000.00, director.getBudget(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1);
        assertEquals(30001.00, director.getSalary(), 0.0);
    }

    @Test
    public void getPayBonus(){
        assertEquals(600.00, director.payBonus(), 0.0);
    }
}
