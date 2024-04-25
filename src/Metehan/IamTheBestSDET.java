package Metehan;

public class IamTheBestSDET {

    //i will upgrade more

    public String   name;
    public int      age;
    public IamTheBestSDET(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "IamTheBestSDET{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name){
        if (name == null || name.isBlank() || name.isEmpty()) {
            System.err.println("Invalid input / data for the name : ");
            System.exit(1);
        }

    }



      }


