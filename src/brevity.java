import java.util.Random;

public class brevity {

    public static void main(String[] args){
        //System.out.println(punch);
        brevity attack = new brevity();
        System.out.println(attack.punch);
    }

   private int punch = (int) (Math.random() * 101);


    public int getPunch(){
        return punch;
    }


}
