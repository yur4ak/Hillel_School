package task21;

public class ManagersHiring {
    public static void main(String[] args) {
        Manager man1 = new Manager();
        man1.teamLead = Manager.ManagerDepartment.design;
        System.out.println(man1.teamLead);
    }
}

//Создайте иерархию классов:
// Person<--Employee<--Manager
//Для класса Person определите хотя бы один конструктор.
//Для класса Employee определите хотя бы два любых конструктора на ваш выбор.
//Для класс Manager определите хотя бы 1 конструктор на ваш выбор.
//В статическом методе main() создайте несколько объектов класса Manager.