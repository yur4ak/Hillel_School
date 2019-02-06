package task21;

public class Person {

    private int age = 0;
    private int height = 0;
    public enum personSex {
        male, female, undefined
    }

    personSex sex;

    public Person(){}

    public Person(int age, int height, personSex sex) {
        this.sex = sex;
        this.age = age;
        this.height = height;
    }
}

