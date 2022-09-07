import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void SetUp(){
        developer = new Developer("Keith", 12345, 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Keith", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(12345, developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1);
        assertEquals(30001.00, developer.getSalary(), 0.0);
    }

    @Test
    public void getPayBonus(){
        assertEquals(300.00, developer.payBonus(), 0.0);
    }
}
