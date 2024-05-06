package fatih;

public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for(String[] eachArr : items){
            for(String eachItem : eachArr){
                System.out.print(eachItem + "\t");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        for(String[] eachArr : items){
            for(int i = eachArr.length - 1; i >= 0; i--){
                System.out.print(eachArr[i] + "\t");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        for(int i = items.length - 1; i >= 0; i--){
            for(String eachItem : items[i]){
                System.out.print(eachItem + "\t");
            }
            System.out.println();
        }

    }

}

/*
10. Create a class named GroceryItems and write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };

    10.2 Print the following output: (add \t between two words)
         Apple    Banana   Grape    Avocado
         Paper Towels     Toilet Papers   Tissues    Diapers
         Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
         Avocado   Grape    Banana    Apple
         Diapers   Tissues   Toilet Papers   Paper Towels
         Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
         Coke   Fanta   Arizona Tea   Pepsi   Water
         Paper Towels     Toilet Papers   Tissues    Diapers
         Apple    Banana   Grape    Avocado

 */
