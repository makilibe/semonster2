package semonster2;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

  @Test
  public void testPlayer1() {
    String name = "TestBot";
    LinkedList<Integer> randNumList = new LinkedList<>();
    randNumList.add(0);
    randNumList.add(0);
    randNumList.add(1);
    randNumList.add(0);
    randNumList.add(2);
    randNumList.add(0);
    randNumList.add(3);
    randNumList.add(0);
    randNumList.add(0);
    randNumList.add(1);


    Player player = new Player(randNumList, name);
    player.drawMonster();

    String expectedString = "Deck:" + name + "\n"
      + "Zombie:レア度[0]\n"
      + "Skeleton:レア度[0]\n"
      + "Cleeper:レア度[0]\n"
      + "Enderman:レア度[0]\n"
      + "Zombie:レア度[1]\n";

    Assert.assertEquals(expectedString, player.toString());

  }
}
