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

  public int getDefense{
    //foo
  }

  public void lowerHP(int hit){

  }

  public void attack(Character char){
    int dmg = (strength* atk) - char.getDefense()
  }
}
