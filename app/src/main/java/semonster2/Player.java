package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

import org.w3c.dom.NameList;


public class Player {
  String name;
  ArrayList<Monster> monsterDeck = new ArrayList<>();
  LinkedList<Integer> randomNumberList; // random 0 to 3

  Player(LinkedList<Integer> randomNumberList, String playerName){
    this.randomNumberList = randomNumberList;
    this.name = playerName;
  }

  public void drawMonster() {

    for (int i = 0; i < 5; i++) {
      this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.randomNumberList.pop()));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + "\n");
    for (Monster m: this.monsterDeck) {
      sb.append(m);
    }
    return sb.toString();
  }
}
