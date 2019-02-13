package task23;

public class Main {
    public static void main(String[] args) {


        Stack s = new Stack();
        s.push('f');
        s.push('t');
        s.push('4');
        s.push('i');
        s.push('m');
        s.push('{');
        s.push('+');
        s.push(')');
        s.push('(');
        s.push('F');
        s.push('8');// over
        s.push('K');// over
        s.printStack();
        System.out.println();
        System.out.println("Element: " + s.pop(10));
        System.out.println("Is stack empty?: " + s.isEmpty());
        System.out.println("Is stack full?: " + s.isFull());
        System.out.println("First element in stack: " + s.peek());
    }
}
