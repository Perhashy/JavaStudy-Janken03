package Janken03;

public class Main {
  public static void main(String[] args) {
    Hand player = new Hand();
    Hand computer = new Hand();
    
    System.out.println("じゃんけんを始めます！");
    System.out.println("--------------------------------");
    GameController.game();
  }
}