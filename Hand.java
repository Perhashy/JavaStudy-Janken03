package Janken03;

import java.util.Scanner;

public class Hand {
  private int hand;

  public void setPlayerHand() {
    Scanner sc = new Scanner(System.in);

    System.out.println("手を数字で入力してください");
    System.out.print("(1：グー、2：チョキ、3：パー)：");
    int playerHand = sc.nextInt();
    System.out.println("--------じゃんけんぽん！--------");
    if (playerHand > 0 && playerHand <= 3) {
      this.hand = playerHand;
    } else {
      System.out.println("正しくない手を出しました、あなたの負けです");
      System.exit(0);
    }

  }
}