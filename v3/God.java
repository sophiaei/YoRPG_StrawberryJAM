public class God extends Protagonist {
  public static void about(){
    System.out.println("God doesn't lose.");
    System.out.println(stats());
  }
  
  public God() {
    super();
    atk = 1000000;
    def = 1000000;
    strength = 1000000;
    health = 1000000;
  }

  public God(String Title) {
    super(Title);
    atk = 1000000;
    def = 1000000;
    strength = 1000000;
    health = 1000000;
  }
}
