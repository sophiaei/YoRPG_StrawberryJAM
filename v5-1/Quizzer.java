import java.io.*;
import java.util.*;

public class Quizzer extends Monster {

  private InputStreamReader isr;
  private BufferedReader in;
  private int response;

  public static void about(){
    System.out.println("Quizzer will ask you a super challenging question that you must answer correctly or else...");
    System.out.println("Quizzer's health is 150." );
    System.out.println("Quizzer's strength is 20 with a random amount of power added ;)" );
    System.out.println("Quizzer's defense is 20." );
    System.out.println("Quizzer's attack is 1." );
  }

  public Quizzer() {
    health = 150;
    strength = 20 + (int)(Math.random()*45);
    def = 20;
    atk = 1;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
  }

  public void update(Character opponent) {
    double randomizer = Math.random();
    if (randomizer < 0.2) {
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
    else if (randomizer < 0.4) {
      System.out.println("You are faced with a ticking time bomb.");
      System.out.println("There are three wires, Red(1), Blue(2), and Green(3).");
      System.out.println("Which do you cut? Answer 1 for Red, 2 for Blue, or 3 for Green");

      try {
        response = Integer.parseInt( in.readLine() );
      }
      catch ( IOException e ) {  }

      if ( response == 1 ) {
        strength = 0;
      }
      else {
        strength = 120;
      }
    }
    else if (randomizer < 0.6) {
      System.out.println("The number 2111x is divisible by exactly one 1-digit number d, where x is a digit.");
      System.out.println("What is d?");

      try {
        response = Integer.parseInt( in.readLine() );
      }
      catch ( IOException e ) {  }

      if (response == 1) {
        strength = 0;
      }
      else {
        strength = 120;
      }
    }
    else if (randomizer < 0.8) {
      System.out.println("A coin is flipped 20 times.");
      System.out.println("Let p be the probability that each of the following sequences occur exactly twice:");
      System.out.println("\t* one head, two tails, one head");
      System.out.println("\t* one head, one tail, two heads");
      System.out.println("Given that p can be expressed as the simplified fraction m/n, find gcd(m,n)");

      try {
        response = Integer.parseInt( in.readLine() );
      }
      catch ( IOException e ) {  }

      if (response == 1) {
        strength = 0;
      }
      else {
        strength = 120;
      }
    }
    else {
      System.out.println("When making cereal, which comes first? Cereal(1) or Milk(2)?");
      System.out.println("Answer 1 for Cereal or 2 for Milk");

      try {
        response = Integer.parseInt( in.readLine() );
      }
      catch ( IOException e ) {  }

      if (response == 1) {
        strength = 0;
      }
      else {
        strength = 1000000;
      }
    }
  }
}
