public class Character{
  protected int health;
  protected int strength;
  protected int def;
  protected double atk;

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

  /*=============================================
    update(Character opponent) will affect how Character's change their attack
    pre: TBD in subclasses
    post: TBD in subclasses
  =============================================*/
  public void update(Character opponent) {
    //to be redefined on an individual basis
  }

  public int attack(Character opponent) {
    update(opponent);

    int damage = (int)(strength * atk) - opponent.getDefense();

    if (damage < 0) {damage = 0;}

    opponent.lowerHP(damage);

    return damage;
  }

}
