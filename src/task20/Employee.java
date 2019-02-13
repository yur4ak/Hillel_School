package task20;

public class Employee {
    private String name;
    private int year;
    private int salary;

    enum Gender {
        MALE, FEMALE //  enum с двумя возможными значениями {MALE, FEMALE}
    }

    private Gender gender;

    public Employee() {

    }

    public Employee(String name, int year, int salary, Gender gender) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.gender = gender;
    }

    public void showParams(){
        System.out.println(name + year + salary + gender);
    }

}
