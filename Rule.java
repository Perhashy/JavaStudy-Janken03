package Janken03;

public class Rule {
  public static boolean draw(int player, int computer) {
    if (player == computer) {
      GameController.gameCount ++;
      System.out.println("あいこです");
      return true;
    } else {
      return false;
    }
  }
}