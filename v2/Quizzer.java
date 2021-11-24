import java.io.*;
import java.util.*;

public class Quizzer extends Monster {

  private InputStreamReader isr;
  private BufferedReader in;
  private int response;
  private String answer;

  public Quizzer() {
    health = 150;
    strength = 20 + (int)(Math.random()*45);
    def = 20;
    atk = 1;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
  }

  public void update(Character opponent) {
    System.out.println("What is 1+1?");
    try {
      response = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) {  }

    if ( response == 2 ) {
      strength = 0;
    }
    else {
      strength = 120;
    }
  }
}
