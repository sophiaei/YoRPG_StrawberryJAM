public class Protagonist extends Character{

  private String name;

  //private int _health;

  /*=============================================
    constructor Protagonist() -- sets everything up
    pre: String title, ints health atk def, double accuracy
    post: sets name heatlh atk def and accuracy to the appropriate values
    =============================================*/
  public Protagonist() {
    name = "Bilbo";
    health = 125;
    strength = 100;
    def = 40;
    atk = .4;

  }

  /*=============================================
    constructor Protagonist( String title ) -- sets everything up
    pre: String title, ints health atk def, double accuracy
    post: sets name to title, and sets heatlh atk def and accuracy to the appropriate values
    =============================================*/
  public Protagonist( String title) {
    name = title;
    health = 125;
    strength = 100;
    def = 40;
    atk = .4;
  }

  /*=============================================
    int getName() -- returns players name
    pre:  name is an initialized String
    post: returns players name
    =============================================*/
  public String getName() {
    return name;
  }

  /*=============================================
    int getHealth() -- returns players health
    pre:  health is an initialized int
    post: returns players health
    =============================================*/
  public int getHealth() {
    return health;
  }

  /*=============================================
    void normalize() -- updates atk and def for a normal attack
    pre: atk and def are ints
    post: resets atk and def to standard values for a normal attack
    =============================================*/
  public void normalize(){
    atk = normAtk;
    def = normDef;
  }

  /*=============================================
    void specialize() -- updates atk and def for a special attack
    pre:  atk and def are ints
    post: updates atk to a randomly higher value, and lowers def
    =============================================*/
  public void specialize() {
    normAtk = atk;
    normDef = def;
    atk = 0.75;
    def = 20;
  }

  public void update(Character opponent) {
    normAtk = atk;
    normDef = def;
  }

  /*=============================================
    int hitOrMiss() -- determines whether a hit lands or not
    pre:  accuracy is an initialized double
    post: returns 1 with probability accuracy, and 0 with probability 1-accuracy
    =============================================*/
/*
  public int hitOrMiss() {
    if ( Math.random() <= accuracy ) {
      return 1;
    }
    else {
      return 0;
    }
  }
  */

  /*=============================================
    double luck() -- returns how luck you are
    pre:
    post: returns a double corresponding to how much your specialized attack damage is boosted
    =============================================*/
    /*
  public double luck() {
    double luckocity = 4 * Math.random();
    if (luckocity > 2) {
      luckocity = 2;  //ensures you can't quadruple your atk, no matter how well you think you can spinning thuner kick
    }
    return luckocity;
  }
  */
}
