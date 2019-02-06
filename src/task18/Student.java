package task18;

public class Student extends Person{
    int course = 1;

    public Student(int h, String n, int course){
        super(h, n);
        this.course = course;
    }

    void tell(){
        System.out.println(super.getName());
        System.out.println(super.getHeight());
        System.out.println(course);
    }

}
