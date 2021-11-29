public class Wizard extends Protagonist{
  public static void about(){
    System.out.println("Wizard grants you random bursts of strength!");
    System.out.println("Your health is 150." );
    System.out.println("You have a vast arsenal of spells with you.");
    System.out.println("Your defense is 20." );
    System.out.println("Your attack is 0.4." );
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
  public void specialize(){
    if (Math.random() < 10){
      health -= 10;
      strength -= 2;
      atk = 1;
      System.out.println("Nature was not meant to bend to the will of man, you have over stepped your boundaries Wizard.");
    }
  }
  public void normalize(){
    atk = 0.4;
  }
}
