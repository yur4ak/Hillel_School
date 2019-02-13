package task20;

public class ManagementDepartment extends Employee{

    private int counter = 0;
    Employee[] empl1 = new Employee[10];

    void add (Employee employee){
        empl1[counter] = employee;

    }

    public void showEmployee(){
        for (int i = 0; i < empl1.length-1; i++) {
            empl1[i].showParams();
        }
    }

}
