public class Doubler extends Monster {

  public Doubler() {
    health = 150;
    strength = 1;
    def = 10;
    atk = 5;
  }

  public void update(Character opponent) {
    atk *= 2;
  }

}
