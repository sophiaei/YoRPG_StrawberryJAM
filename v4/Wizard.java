public class Wizard extends Protagonist{
  public static void about(){
    System.out.println("Wizard grants you random bursts of strength!");
    System.out.println("Your health is 150." );
    System.out.println("Your strength is a random amount of power added ;)" );
    System.out.println("Your defense is 20." );
    System.out.println("Your attack is 1." );
  }
  public Wizard() {
    super();
  }

  public Wizard(String Title) {
    super(Title);
  }

  public void update(Character opponent) {
    strength = (int)(Math.random() * 20);
  }
}
