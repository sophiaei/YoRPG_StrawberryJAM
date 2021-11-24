public class Monster extends Character{
  /*=============================================
    constructor Protagonist( int difficulty ) -- sets everything up
    pre: ints health atk def, double accuracy are all set up
    post: sets heatlh atk def and accuracy to the appropriate values
    =============================================*/
  protected int numCalled = 0;
  public Monster() {
    health = 150;
    strength = 20 + (int)(Math.random()*45);
    def = 20;
    atk = 1;
  }

  /*=============================================
    constructor Protagonist( int difficulty ) -- sets everything up
    pre: ints health atk def, double accuracy are all set up according to how difficult the play wishes it to be
    post: sets heatlh atk def and accuracy to the appropriate values
    =============================================*/
  public Monster(int difficulty) {
    health = 30;
    def = 5;
    atk = 4;
    if (difficulty == 1) {
      //foo easy
    }
    if (difficulty == 2) {
      //foo medium
    }
    if (difficulty == 3) {
      //foo hard
    }
  }

/* ACCESSORS */

  /*=============================================
    int hitOrMiss() -- determines whether a hit lands or not
    pre:  accuracy is an initialized double
    post: returns 1 with probability accuracy, and 0 with probability 1-accuracy
    =============================================*/
  /*public int hitOrMiss() {
    if ( Math.random() <= accuracy ) {
      return 1;
    }
    else {
      return 0;
    }
  }*/

}
