public class Wildcard extends Monster {

  public static void about(){
    System.out.println("WildCard will attack you with random forces of strength!");
    System.out.println("WildCard's health is 100." );
    System.out.println("WildCard's strength is wild! a random integer between 0 and 19." );
    System.out.println("WildCard's defense is 10." );
    System.out.println("WildCard's attack is 5." );
  }
  public Wildcard() {
    health = 100;
    strength = (int)(Math.random() * 20);
    def = 10;
    atk = 5;
  }

  /*=============================================
    int hitOrMiss() -- determines whether a hit lands or not
    pre:  accuracy is an initialized double
    post: returns 1 with probability accuracy, and 0 with probability 1-accuracy
    =============================================*/
  public void update(Character opponent) {
    strength = (int)(Math.random() * 20);
  }
}
