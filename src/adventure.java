import java.util.Scanner;
//import java.util.Random;
public class adventure {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Before we head out what is your name? ");
        String userInput = scanner.next();
        System.out.println("Are ready to go outside?");
        String option1 = scanner.next();

        boolean confirmation = userInput.contains("yes");

        if (option1.contains("yes")){ //wait what did you say?
            System.out.println("Let's go outside!");
        } else if(option1.contains("no") && !confirmation){
            System.out.println("See ya later then!");
        }
        System.out.format("Where to? %n " +
                "========Places========%n" +
                "Mall %n" +
                "Park %n" +
                "Store %n" +
                "Home %n" +
                "======================%n");
        String option2 = scanner.next();
        boolean confirm = userInput.contains("yes");
       if (option2.contains("mall")){
           System.out.println("to the mall!");
           System.out.println("We're at the " + option2 + ". What now?");
           System.out.format("Should we ... %n " +
                   "========Places========%n" +
                   "Shop %n" +
                   "Walk around %n" +
                   "Food court %n" +
                   "People watch %n" +
                   "Leave mall %n" +
                   "======================%n");
           String option3 = scanner.next();
       } else if (option2.contains("park")) {
           System.out.println("to the park!");
           System.out.format("Should we ... %n " +
                   "========Places========%n" +
                   "Play %n" +
                   "Walk around %n" +
                   "Explore %n" +
                   "People watch %n" +
                   "Leave park %n" +
                   "======================%n");
           String option3 = scanner.next();
       } else if(option2.contains("store")){
           System.out.println("lets go pick up some stuff at the store!");
           System.out.format("Should we ... %n " +
                   "========Places========%n" +
                   "Produce %n" +
                   "Dairy %n" +
                   "Freezer food %n" +
                   "Deli %n" +
                   "Beverages %n" +
                   "Miscellaneous %n" +
                   "Leave store %n" +
                   "======================%n");
           String option3 = scanner.next();
       } else if (option2.contains("home")){
           System.out.println("We'll stay in today");
           System.out.format("Should we ... %n " +
                   "========Places========%n" +
                   "Make something to eat %n" +
                   "Watch TV %n" +
                   "Take a nap %n" +
                   "Sleep %n" +
                   "Hobby %n" +
                   "Miscellaneous %n" +
                   "Cruise around %n" +
                   "======================%n");
           String option3 = scanner.next();
           System.out.println("You decide to " + option3 );
       }





    }



}





