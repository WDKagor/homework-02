public class Main {
    public static void main(String[] args)
    {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeightBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общая масса двух бойцов " + totalWeightBoxers + " кг!");
        var weightDidderents1 = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе двух бойцов " + weightDidderents1 + " кг!");
        var weightDidderents2 = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весе двух бойцов " + weightDidderents2 + " кг!");

        var totalHoursOfOperation1 = 640;
        var workingTimeOfOnePerson = 8;
        var numberOfEmployees = totalHoursOfOperation1 / workingTimeOfOnePerson;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        var additionalEmployees = 94;
        var totalEmployees = numberOfEmployees + additionalEmployees;
        var totalHoursOfOperation2 = totalEmployees * workingTimeOfOnePerson;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHoursOfOperation2 + " часа работы может быть поделено между сотрудниками");


    }
}