package Janken03;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Hand {
  private int hand;

  public void setPlayerHand() {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("手を数字で入力してください");
      System.out.print("(1：グー、2：チョキ、3：パー)：");
      int playerHand = sc.nextInt();
      System.out.println("--------じゃんけんぽん！--------");
      if (playerHand > 0 && playerHand <= 3) {
        this.hand = playerHand;
      } else {
        System.out.println("正しくない手を出しました、あなたの負けです");
        GameController.gameExit();
      }
    } catch (InputMismatchException e){
      System.out.println("---------------------------------");
      System.out.println("数値以外が入力されました");
      GameController.gameExit();
    }
  }

  public void setComputerHand() {
    Random random = new Random();
    this.hand = random.nextInt(3) + 1;
  }

  public int getHand() {
    return this.hand;
  }

  public String stringHand() {
    switch (this.hand) {
      case 1: return "グー";
      case 2: return "チョキ";
      case 3: return "パー";
    }
    return "問題が発生しました";
  }
}