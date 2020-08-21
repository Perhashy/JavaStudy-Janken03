package Janken03;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();

    System.out.println("じゃんけんを始めます！");

    do {
      GameController.game(player, computer);
      GameController.nextGame();
    } while (GameController.checkNext());
    System.out.println("--------------------------------");
    System.out.println("ゲームを終了します");
    System.out.println("また遊んでね！");
    System.exit(0);

  }
}