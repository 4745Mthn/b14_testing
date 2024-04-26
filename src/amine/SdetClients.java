package amine;

public class SdetClients {
    public static void main(String[] args) {
        Sdet sdet1 = new Sdet("Amine",31, 'F',"Javascript");
        Sdet sdet2 = new Sdet("Zeynep",31, 'F',"Phyton");
        Sdet sdet3 = new Sdet("Dilovar",31, 'M',"C++");
        Sdet sdet4 = new Sdet("Metehan",31, 'M',"Java");
        Sdet sdet5 = new Sdet("Ziyoda",31, 'F',"Kotlin");

        System.out.println(sdet1);
        System.out.println(sdet2);
        System.out.println(sdet3);
        System.out.println(sdet4);
        System.out.println(sdet5);

        sdet1.work();
        sdet2.work();
        sdet3.work();
        sdet4.work();
        sdet5.work();

    }
}
