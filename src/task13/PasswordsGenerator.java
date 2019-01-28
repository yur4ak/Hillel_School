package task13;

import utils.Helpers;

public class PasswordsGenerator {
    private static final int specCase = 1;
    private static final int numCase = 3;
    private static final int lowCase = 2;
    private static final int upCase = 2;
    private static final int passLnght = specCase + numCase + lowCase + upCase;

    public static void main(String[] args) {
        String smbLC = "zaqwsxcderfvbgtyhnmjuiklop"; // lower case
        String smbUC = "ZAQWSXEDCRFVTGBYHNUJMIKOLP"; // upper case
        String smbNC = "1234567890";                 // numbers case
        String smbSC = "!@#$%_";                     // special case
        char[] coherentPass = new char[passLnght];

        for (int i = 0; i < passLnght; i++) {
            if (i < lowCase) {
                int rndLC = Helpers.getRandomRnd(0, smbLC.length() - 1);
                coherentPass[i] = smbLC.charAt(rndLC);
            }
            if (i >= lowCase && i < upCase + lowCase) {
                int rndUC = Helpers.getRandomRnd(0, smbUC.length() - 1);
                coherentPass[i] = smbUC.charAt(rndUC);
            }
            if (i >= upCase + lowCase && i < upCase + lowCase + numCase) {
                int rndNC = Helpers.getRandomRnd(0, smbNC.length() - 1);
                coherentPass[i] = smbNC.charAt(rndNC);
            }
            if (i >= upCase + lowCase + numCase) {
                int rndSC = Helpers.getRandomRnd(0, smbSC.length() - 1);
                coherentPass[i] = smbSC.charAt(rndSC);
            }
        }
        //////////////////---------------------

        for (int p = 0; p < passLnght; p++) {
            swap(coherentPass, p, Helpers.getRandomRnd(0, passLnght - 1));
        }

        for (int i = 0; i < passLnght; i++) {
            System.out.println(coherentPass[i] + " ");
        }
    }

    public static void swap(char[] chrP, int i, int r) {
        char temp = chrP[i];
        chrP[i] = chrP[r];
        chrP[r] = temp;
    }
}

//Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
//Пароль состоит из 8 символов
//В пароле допускаются только латинские большие и маленькие буквы, цифры, а также спецсимволы из ограниченного набора
//таких символов: ! @ # $ % _
//Пароль обязательно должен содержать:
//большие и маленькие символы, цифры и спецсимволы.
//Символы в пароле не должны повторяться. Но, в верхнем ‘Z’ и ‘z’ в нижнем регистре - это разные
//символы, т.е не считаются дубликатами. В пароле должны быть соблюдены следующие квоты разных типов символов:
//только 1 спецсимвол;
//только 3 цифры;
//только 2 символа в нижнем регистре;
//только 2 символа в верхнем регистре.
//Пример:
//“!sd5D4F1” - корректный пароль
//“dXsV#24k” - некорректный пароль, т.к количество символов в нижнем регистре и цифр не соответствует требуемому количеству.

        /*for (int r = 0; r < 99; r++) {
            for (int i = 0; i < passLnght; i++) {

                int rnd = Helpers.getRandomRnd(0, passLnght-1);
                int x = 0;
                if (tempArr[rnd] != -1) {
                    x = tempArr[rnd];
                    tempArr[rnd] = -1;
                    rndPassArr[i] = coherentPass[x];

                }
            }
        }*/

        /*char[] rndPassArr = new char[passLnght];

        for (int i = 0; i < passLnght; i++) {
            int x = Helpers.getRandomRnd(0, passLnght);
            tempArr[i] = x;
        }
            for (int j = 0; j < passLnght; j++) {
                for (int k = 0; k < passLnght; k++) {

                    if (tempArr[j] == tempArr[k]){
                        tempArr[k] = Helpers.getRandomRnd(0, passLnght);
                    }
                }
            }*/

            /*for (int j = 0; j < passLnght; j++) {
                if (tempArr[j] == x){
                    continue;
                } else tempArr[j] = x;*/

//rndPassArr[i] = coherentPass[tempArr[i]];
// }