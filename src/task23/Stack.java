package task23;

public class Stack {
    private char[] stack = new char[10];
    //private char previousChar = ' ';
    //private int currentState = 0;
    private char nullSmbl = ' ';

    public void push(char c) { //положить элемент в стек. Если стек заполнен полностью, то ничего не делать
        if (stack[stack.length - 1] == nullSmbl) {
            if (stack[0] == nullSmbl) {
                stack[0] = c;
            } else {
                for (int i = stack.length - 1; i != 0; i--) {
                    stack[i] = stack[i - 1];
                }
                stack[0] = c;
            }
        }
    }

    public char pop(int x) { //извлечь элемент из стека. Если стек пуст, то вернуть 0
        if (x < stack.length+1 && x > 0) {
            if (stack[x - 1] != nullSmbl) {
                return stack[x - 1];
            } else return 0;
        } else return 0;
    }

    public char peek() { //узнать элемент на вершине стека,без извлечения из самого стека. стек пуст, то вернуть 0.
        if (stack[0] != nullSmbl) {
            return stack[0];
        } else return 0;
    }

    public boolean isEmpty() { // возвращает true, если стек пуст
        if (stack[0] == nullSmbl) {
            return true;
        } else return false;
    }

    boolean isFull() { // возвращает true, если стек полностью заполнен
        if (stack[stack.length - 1] != nullSmbl) {
            return true;
        } else return false;

    }

    public void printStack() {
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + ": " + (i + 1) + " | ");
        }
    }
}

