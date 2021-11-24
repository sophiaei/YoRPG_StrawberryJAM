public class Healer extends Protagonist {
  public static void about(){
    System.out.println("Healer's special doesn't deal damage and will instead restore health if it is below 10.");
    System.out.println(stats());
  }
  public Healer() {
    super();
  }

  public Healer(String Title) {
    super(Title);
  }

  public void specialize() {
    atk = 0;
    def = 0;
    if (health < 10) {
      health += 50;
    }
  }
}
