import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        out.println(dog);
        cat = cat + 4;
        out.println(cat);
        paper = paper + 4;
        out.println(paper);
        dog = dog - 3.5;
        out.println(dog);
        cat = cat - 1.6;
        out.println(cat);
        paper = paper - 7639;
        out.println(paper);

        var friend = 19;
        friend = friend + 2;
        out.println(friend);
        friend = friend / 7;
        out.println(friend);

        var frog = 3.5;
        frog = frog * 10;
        out.println(frog);
        frog = frog / 3.5;
        out.println(frog);
        frog = frog + 4;
        out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        out.println("общий вес бойцов состовляет " + totalWeight + "кг");
        var weightDifference = boxer2 - boxer1;
        out.println("Разница бойцов в весе составляет " + weightDifference + "кг " );
        var remainder = boxer2 % boxer1;
        out.println("Остаток деления между вессами " + remainder);

        var sharedHours = 640;
        var workingDay = 8;
        var totalEmployees = sharedHours / workingDay;
        out.println("Всего работников в компании " + totalEmployees + " человек");
        out.println("Если в компании работает " + (totalEmployees + 94) + " человек, то всего " + sharedHours /(totalEmployees + 94) + " часов работы может быть поделено между сотрудниками.");


    }
}