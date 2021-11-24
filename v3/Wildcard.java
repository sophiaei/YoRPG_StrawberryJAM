public class Wildcard extends Monster {

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
