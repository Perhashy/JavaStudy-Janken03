package Janken03;

public class GameController {
  protected static int winCount = 0;
  protected static int loseCount = 0;
  protected static int drawCount = 0;
  protected static int gameCount = 1;
  protected static int nextGame;

  public static void game(Hand player, Hand computer) {
    System.out.println(gameCount + "回目のゲーム！");

    do {
      player.setPlayerHand();
      computer.setComputerHand();

      System.out.println("あなた：" + player.stringHand());
      System.out.println("あいて：" +computer.stringHand());
    } while (Rule.draw(player.getHand(), computer.getHand()));
    Rule.result(player.getHand(), computer.getHand());
    System.out.println("--------------戦績--------------");
    System.out.println("勝ち：" + winCount + "回");
    System.out.println("負け：" + loseCount + "回");
    System.out.println("引き分け：" + drawCount + "回");
    
  }
}