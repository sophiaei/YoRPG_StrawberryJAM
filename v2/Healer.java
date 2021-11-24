public class Healer extends Protagonist {
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
