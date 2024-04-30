package zeynep;

public class Sdet {

    private String name;
    private int age;
    private char gender;
    private String programmingLanguage;
    private boolean isFullStackTester;

    public Sdet(String name, int age, char gender, String programmingLanguage, boolean isFullStackTester) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.programmingLanguage = programmingLanguage;
        this.isFullStackTester = isFullStackTester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public boolean isFullStackTester() {
        return isFullStackTester;
    }

    public void setFullStackTester(boolean fullStackTester) {
        isFullStackTester = fullStackTester;
    }


    public void work(){
        System.out.println(name + " is a great SDET");
    }

    @Override
    public String toString() {
        return "Sdet{" +
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

