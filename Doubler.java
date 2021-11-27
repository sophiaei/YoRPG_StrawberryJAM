public class Doubler extends Monster {

  public static void about(){
    System.out.println("Doubler starts with low health and attack, \nbut every round their attack doubles. \nBetter finish them off quickly!");
    System.out.println("Doubler's health is 100." );
    System.out.println("Doubler's strength is 1." );
    System.out.println("Doubler's defense is 10." );
    System.out.println("Doubler's attack is 5." );
  }
  public Doubler() {
    health = 100;
    strength = 1;
    def = 10;
    atk = 5;
  }

  public void update(Character opponent) {
    atk *= 2;
  }

}
