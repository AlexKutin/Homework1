public class TaskVariables1 {

    public static void main(String[] args) {
        var dog = 8D;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Task1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Task2");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Task3");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        var friend = 19;
        System.out.println("Task4");
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);
        System.out.println();

        var frog = 3.5;
        System.out.println("Task5");
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);
        System.out.println();

        System.out.println("Task6");
        var boxerWight1 = 78.2;
        var boxerWight2 = 82.7;
        var totalBoxerWeight = boxerWight1 + boxerWight2;
        System.out.println("boxerWight1 = " + boxerWight1);
        System.out.println("boxerWight2 = " + boxerWight2);
        System.out.println("totalBoxerWeight = " + totalBoxerWeight);
        var weightDifference = boxerWight2 - boxerWight1;
        System.out.println("weightDifference = " + weightDifference);
        System.out.println();

        System.out.println("Task7");
        var weightDifferenceMod = boxerWight2 % boxerWight1;
        System.out.println("weightDifferenceMod = " + weightDifferenceMod);
        System.out.println();

        System.out.println("Task8");
        var totalWorkTimeCompany = 640;
        var workTime = 8;
        var countWorkers = totalWorkTimeCompany / workTime;
        System.out.println("Всего работников в компании – " + countWorkers + " человек");
        var newCountWorkers = countWorkers + 94;
        var newWorkTimeCompany = newCountWorkers * workTime;
        System.out.println("Если в компании работает " + newCountWorkers + " человек, то всего " + newWorkTimeCompany + " часов работы может быть поделено между сотрудниками");
    }
}
