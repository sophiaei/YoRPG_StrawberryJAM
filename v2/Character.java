public class Character{
  protected int moveCount;
  protected int health;
  protected int strength;
  protected int def;
  protected double atk;
  protected String[] attackTypes;

  /*=============================================
    boolean isAlive() -- returns true if player is alive, and false otherwise
    pre:  health is an initialized int
    post: if the player has remaining health return true, return false otherwise
    =============================================*/
  public boolean isAlive() {
    return health > 0;
  }

  /* ACCESSORS */
  /*=============================================
    int getHealth() -- returns monsters health
    pre:  health is an initialized int
    post: returns players health
    =============================================*/
  public int getHealth() {
    return health;
  }

  public int getDefense() {
    return def;
  }

  public double getAttack() {
    return atk;
  }

  public void lowerHP(int hit) {
    health -= hit;
  }

  public void update(Character opponent) {
    //to be redefined on an individual basis
  }

  public void reset() {
    //to be redefined on an individual basis
  }

  public void switcheroo(double atkN, int defN, int healthN) {
    atk = atkN;
    def = defN;
    health = healthN;
  }

  public int attack(Character opponent) {
    update(opponent);

    int damage = (int)(strength * atk) - opponent.getDefense();

    if (damage < 0) {damage = 0;}

    opponent.lowerHP(damage);

    reset();

    return damage;
  }

}
