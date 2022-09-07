import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void SetUp(){
        databaseAdmin = new DatabaseAdmin("Keith", 12345, 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Keith", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(12345, databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1);
        assertEquals(30001.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void getPayBonus(){
        assertEquals(300.00, databaseAdmin.payBonus(), 0.0);
    }
}
