import java.util.Random;

public class brevity {

    public static void main(String[] args){
        //System.out.println(punch);
    }

   private  int punch = (int) (Math.random() * 101);

    public int getPunch(){
        return punch;
    }

    public void setPunch(int punch){
        this.punch = punch;
    }

}
