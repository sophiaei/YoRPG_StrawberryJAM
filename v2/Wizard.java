public class Wizard extends Protagonist{
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
