public class Character{
  private int health;
  private int strength;
  private int def;
  private double atk;

  /*=============================================
    boolean isAlive() -- returns true if player is alive, and false otherwise
    pre:  health is an initialized int
    post: if the player has remaining health return true, return false otherwise
    =============================================*/
  public boolean isAlive(){
    return health > 0;
  }

  public int getDefense(){
    return def;
  }

  public void lowerHP(int hit){
    health -= hit;
  }

  public int attack(Character opponent){
    int damage = (int)(strength* atk) - opponent.getDefense();

    if (damage > 0) {damage = 0;}

    opponent.lowerHP(damage);
    return damage;
  }

}
