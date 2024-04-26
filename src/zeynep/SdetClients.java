package zeynep;

public class SdetClients {

    public static void main(String[] args) {

        Sdet sdet1 = new Sdet("Zeynep", 34, 'F',"Python", true);
        Sdet sdet2 = new Sdet("Dilovar", 34, 'M', "Java", true);
        Sdet sdet3 = new Sdet("Amine", 34, 'F', "JavaScript", true);
        Sdet sdet4 = new Sdet("Metehan", 34, 'M', "C++", true);
        Sdet sdet5 = new Sdet("Kbreab", 34, 'M', "Java", true);
        Sdet sdet6 = new Sdet("Ziyoda", 34, 'F', "Kotlin", true);

        System.out.println(sdet1);
        System.out.println(sdet2);
        System.out.println(sdet3);
        System.out.println(sdet4);
        System.out.println(sdet5);
        System.out.println(sdet6);


        sdet1.work();
        sdet2.work();
        sdet3.work();
        sdet4.work();
        sdet5.work();
        sdet6.work();

        sdet2.setAge(32);
        System.out.println(sdet2);


    }
}
