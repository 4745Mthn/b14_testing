package amine;

public class Sdet {
    //make the fields private to prevent change of values
    private final String name;
    private int age;
    private char gender;
    private String programmingLanguage;
    private boolean isFullStackTester;

    // set contructors so that variety of information input can happen
    public Sdet(String name){
        this.name = name;
    }
    public Sdet(String name, int age){
        this(name);
        this.age = age;
    }
    public Sdet(String name, int age, char gender){
        this(name,age);
        this.gender= gender;
    }
    public Sdet(String name, int age, char gender, String programmingLanguage){
        this(name,age,gender);
        this.programmingLanguage= programmingLanguage;
    }
    public Sdet(String name, int age, char gender, String programmingLanguage, boolean isFullStackTester){
        this(name,age,gender,programmingLanguage);
        this.isFullStackTester= isFullStackTester;
    }

    public void work(){
        System.out.println(name + " is a great SDET");
    }

    @Override
    public String toString() {
        return "SDET{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", isFullStackTester=" + isFullStackTester +
                '}';
    }
}

/*
Create a custom class named sdet with fallowing specifications:

Attribites:

            name (String)
            age (int)
            gender (char)
            programmingLanguages (String)
            isFullStackTester (boolean)

Constructors:
            Add multiple constructors to set different fields of the Sdets object.

Actions:
        work(): prints the  name of the employee concatenated with " is great Sdet"
        toString(): returns a string representation of the sdet object.

    Create another class named sdetClients, create multiple Sdets objects, and test each function of the sdet object.

*/

