package task10;

import utils.Helpers;

public class TeamManager {
    public static void main(String[] args) {
        int[] teamBulls = new int[24];
        int[] teamBears = new int[24];
        int allBulls = 0;
        int allBears = 0;
        for (int i : teamBulls
        ) {
            teamBulls[i] = Helpers.getRandom(19, 55);
            teamBears[i] = Helpers.getRandom(19, 55);
            System.out.println("Bulls: " + teamBulls[i] + "  |  " + "Bears: " + teamBears[i]);
            allBulls += teamBulls[i];
            allBears += teamBears[i];
        }
        int avBulls = allBulls / teamBulls.length;
        int avBears = allBears / teamBears.length;

        System.out.println("Averege Bulls: " + avBulls);
        System.out.println("Averege Bears: " + avBears);
        if (avBears == avBulls)
            System.out.println("Teams has equal team members experience.");
        if (avBears > avBulls)
            System.out.println("Bears has bigger experience.");
        if (avBears < avBulls)
            System.out.println("Bulls has bigger experience.");
    }
}

//Есть две команды. Каждая состоит из 25-ти человек разного возраста.
//Выведите на экран в двух отдельных строках  возраст участников каждой команды;
//посчитайте средний возраст каждой из команд и выведете в консоль чей средний возраст команды больше
//или укажите, если средний возраст членов команд равны.
//Воспользуйтесь конструкцией foreach для перебора элементов массива.