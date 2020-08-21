package Janken03;

public class GameController {
  protected static int winCount = 0;
  protected static int loseCount = 0;
  protected static int drawount = 0;
  protected static int gameCount = 1;
  protected static int nextGame;

  public static void game() {
    System.out.println(gameCount + "回目のゲーム！");
  }
}