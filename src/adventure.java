import java.util.Scanner;
import java.util.Random;

public class adventure {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Before we head out what is your name? ");
        String userInput = scanner.next();

        System.out.println("Are you ready?");

        String option1 = scanner.next();
        //while (userInput.contains("yes")) {

        boolean confirmation = userInput.contains("yes");
        do {
            System.out.println("Are ready to wake up today?");
            String optionOne = scanner.next();

                if (optionOne.contains("yes")) { //wait what did you say?
                    System.out.println("Let's do something!");
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
                            System.out.println("You walk around the mall, taking in the grandeur of the elevators and the magnificence of the glass architecture and then head home.");
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
                        //Loop to play around and When finished loop back to let's go outside when finished playing
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
                        //Loop back to option Store if buying more stuff and add loop to lets go outside when done
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
                        boolean leave = userInput.contains("leave");

                         String option4 = scanner.next();

                         if (option4.contains("heavy")) {
                             System.out.println("You square up and begin hitting the heavy bag");

                             int punch = (int) (Math.random() * 101);
                             String punchTime = scanner.next();

                             if (punch > 50) {
                                 //System.out.println("Don't hurt yourself hitting the bag too hard now");
                                 System.out.println("You hit the bag for " + punch + " damage!");
                                 System.out.println("Don't hurt yourself hitting the bag too hard now");
                             } else if (punch < 50) {
                                 System.out.println("hard enough to work the bag, but not enough to hurt yourself.");
                             }
                             System.out.println("Time to get some rest!");
                             //Loop the punches so the person punch bag until they choose to stop
                         } else if (option4.contains("speed")) {
                             System.out.println("You get into ready stance and start hitting speed bag");
                         } else if (option4.contains("leave") || leave) {
                             System.out.println("ok, lets do something else.");
                         } else {
                             System.out.println("Nevermind");
                         }

                        //Loop back to options Home since we are at home
                    } else {
                        System.out.println("I wonder what happened here?");
                    }


                }else if(optionOne.contains("no") || !confirmation){
                    System.out.println("I'll see ya tomorrow then, have a good day");
                    break;
                }
        }while (option1.contains("yes")) ;


        }
    }
