import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void SetUp(){
        manager = new Manager("Keith", 12345, 30000.00, "CodeClan");
    }

    @Test
    public void hasName(){
        assertEquals("Keith", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("John");
        assertEquals("John", manager.getName());
    }

    @Test
    public void cannotSetNullName(){
        String b = null;
        manager.setName(b);
        assertEquals("Keith", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(12345, manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("CodeClan", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1);
        assertEquals(30001.00, manager.getSalary(), 0.0);
    }

    @Test
    public void cannotRaiseSalary(){
        manager.raiseSalary(-1);
        assertEquals(30000.00, manager.getSalary(), 0.0);

    }

    @Test
    public void getPayBonus(){
        assertEquals(300.00, manager.payBonus(), 0.0);
    }
}
