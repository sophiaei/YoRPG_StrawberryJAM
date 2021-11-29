//CRYING

public class ReflectOChangeO extends Monster {
  public ReflectOChangeO() {
    System.out.println("roco called");
    health = 150;
    strength = 20 + (int)(Math.random()*45);
    def = 20;
    atk = 1;
    numCalled +=1;
  }

  private int updateCalled = 0;

  public void update(Character opponent) {
    updateCalled += 1;
    System.out.println("Opponent " + opponent);
    System.out.println("called " + updateCalled + " times");
    //if (Math.random() < 1) {

      double atkToBe = opponent.getAttack();
      int defToBe = opponent.getDefense();
      int healthToBe = opponent.getHealth();
      System.out.println("To Be's " + atkToBe + " " +  defToBe + " " + healthToBe);
      opponent.switcheroo(atk, def, health);  //switching opponent to ours
      switcheroo(atkToBe, defToBe, healthToBe); //switch ours to opponent
      System.out.println("Your stats " + atk + " " + def + " " + health +  " ");
      System.out.println("Opponent's stats " + opponent.getAttack() + " " + opponent.getDefense() + " " + opponent.getHealth() + " ");
      System.out.println("WOOOOO switcherooooooo");
    //}
  }

  public void reset() {
    //
  }
}
