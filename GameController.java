package Janken03;

public class GameController {
  protected static int winCount = 0;
  protected static int loseCount = 0;
  protected static int drawount = 0;
  protected static int gameCount = 1;
  protected static int nextGame;

  public static void game(Hand player, Hand computer) {
    System.out.println(gameCount + "回目のゲーム！");

    player.setPlayerHand();
    computer.setComputerHand();

    System.out.println("あなた：" + player.stringHand());
    System.out.println("あいて：" +computer.stringHand());
  }
}