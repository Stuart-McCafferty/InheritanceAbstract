package staff;

public abstract class Employee {
    protected String name;
    protected int NINumber;
    protected double salary;

    public Employee(String name, int NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if (name != null){
             this.name = name;
        }
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increaseSalary){
        if (increaseSalary > 0){
            this.salary = salary + increaseSalary;
        } else {
            System.out.println("Cannot raise salary");
        }
    }

    public double payBonus(){
        return this.salary / 100;
    }

}
