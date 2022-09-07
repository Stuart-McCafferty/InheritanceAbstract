package management;
import staff.Employee;

public class Manager extends Employee {

    protected String deptName;

    public Manager(String name, int NINumber, double salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
