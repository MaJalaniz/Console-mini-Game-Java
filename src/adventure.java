import java.util.Scanner;
//import java.util.Random;
public class adventure {

    //Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
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
                "======================%n");
        String option2 = scanner.next();
        boolean confirm = userInput.contains("yes");
       if (option2.contains("mall")){
           System.out.println("to the mall!");
       } else {
           System.out.println("Should we stay in today?");
       }

        //System.out.println("You entered:  \"" + userInput + "\"");



    }



}





