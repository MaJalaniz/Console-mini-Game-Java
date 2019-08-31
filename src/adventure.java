import java.util.Scanner;
//import java.util.Random;
public class adventure {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Before we head out what is your name? ");
        String userInput = scanner.next();
        System.out.println("Are ready to wake up today?");
        String option1 = scanner.next();

        boolean confirmation = userInput.contains("yes");
        if (option1.contains("yes")) { //wait what did you say?
            System.out.println("Let's go outside!");
            System.out.format("Where to? %n " +
                    "========Places========%n" +
                    "Mall %n" +
                    "Park %n" +
                    "Store %n" +
                    "Home %n" +
                    "======================%n");
            String option2 = scanner.next();
            boolean confirm = userInput.contains("yes");
            if (option2.contains("mall")) {
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
                if (option3.contains("walk")) {
                    System.out.println("You walk around the mall, taking in the grandeur of the elevators and the magnificence of the glass architecture");
                }
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
            } else if (option2.contains("store")) {
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
            } else if (option2.contains("home")) {
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
                System.out.println("You decide to work off some energy with boxing.");

                System.out.println("Luckily you have boxing equipment in your closet, and with fierce determination you ready yourself. ");
                System.out.format("Which punching bag do you use? %n " +
                        "========Places========%n" +
                        "Speed %n" +
                        "Heavy %n" +
                        "Leave %n" +
                        "======================%n");
                String option4 = scanner.next();
                if (option4.contains("heavy")) {
                    System.out.println("You square up and begin hitting the heavy bag");
                    int punch = (int)(Math.random() * 101);
                    String punchTime = scanner.next();
                    System.out.println("You hit the bag for " + punch + " damage!");
                } else if(option4.contains("speed")) {
                    System.out.println("You get into ready stance and start hitting speed bag");
                } else{
                    System.out.println("Nevermind");
                }
            } else if (option1.contains("no") && !confirmation) {
                System.out.println("See ya later then!");
            }


        }
    }

}





