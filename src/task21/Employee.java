package task21;

public class Employee extends Person {
    private boolean perHourPay;
    private boolean contract; // contract or freelance
    private int vacation = 24; // days

    public Employee(){}

    public Employee(boolean perHourPay, boolean contract, int age, int height, personSex sex){
        super(age, height, sex);
        this.perHourPay = perHourPay;
        this.contract = contract;

    }
}
