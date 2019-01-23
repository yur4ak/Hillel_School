package task12;

import utils.Helpers;

public class FindAndPrintString {
    public static void main(String[] args) {
        String inStr = "Одесса мой город родной";
        inStr = inStr.toLowerCase();
        System.out.println(inStr);

        System.out.print("Found Index :");

        for (int i = 0; i < inStr.length()-1; i++) {
            int indx = inStr.indexOf('о', i);
            if (indx != inStr.indexOf('о', i+1))
                System.out.print(indx + " ");
        }
    }
}


//Дана строке String inStr = “Одесса мой город родной”;
//Найти и вывести на экран все найденные индексы для символа ‘о’
//без учёта регистра, т.е как для заглавных так и строчных символов.