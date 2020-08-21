package Janken03;

public class Rule {
  public static boolean draw(int player, int computer) {
    if (player == computer) {
      GameController.drawCount ++;
      System.out.println("あいこです");
      return true;
    } else {
      return false;
    }
  }

  public static void result(int player, int computer) {
    if ((player == 1 && computer == 2) ||
        (player == 2 && computer == 3) ||
        (player == 3 && computer == 1)) {
          GameController.winCount ++;
          System.out.println("おめでとう！あなたの勝ちです！");
    } else {
      GameController.loseCount ++;
      System.out.println("残念！あなたの負けです");
    }
  }
}