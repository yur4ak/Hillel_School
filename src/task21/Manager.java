package task21;

public class Manager extends Employee {
    enum ManagerDepartment {
        script, design, sales, security, administrative
    }

    private int salary = 1000;
    private int experience = 100;

    ManagerDepartment teamLead;

    public Manager() {
    }


}
