//CRYING

public class ReflectOChangeO extends Monster {
  public ReflectOChangeO() {
    health = 150;
    strength = 20 + (int)(Math.random()*45);
    def = 20;
    atk = 1;
  }

  public void update(Character opponent) {
    if (Math.random() < 1) {

      double atkToBe = opponent.getAttack();
      int defToBe = opponent.getDefense();
      int healthToBe = opponent.getHealth();
      opponent.switcheroo(atk, def, health);  //switching opponent to ours
      //switcheroo(atkToBe, defToBe, healthToBe); //switch ours to opponent
      System.out.println(atk + " " + def + " " + health +  " ");
      System.out.println(opponent.getAttack() + " " + opponent.getDefense() + " " + opponent.getHealth() + " ");
      System.out.println("WOOOOO switcherooooooo");
    }
  }
}
