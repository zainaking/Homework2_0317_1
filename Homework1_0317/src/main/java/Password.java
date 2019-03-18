
import java.util.Scanner;

public class Password {



    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;

  while (x <= 4) {

      if ( scanner.next().equals( "TGIF")) {
          System.out.println("You logged in " + " You have tried " + x + " times.");



      } else if(x < 4){
          System.out.println("You're locked out " + x);

      }

  }






    }

}
