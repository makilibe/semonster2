
package semonster2;

public class Monster {
  private String name;
  private int rare; // 珍しさ

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
  }

  String summonMonster(int mNumber) {
<<<<<<< HEAD
    String monster[] = {"Zombie", "Skelton", "Cleeper", "Enderman"};
=======

    String monster[] = {"Zombie", "Skelton", "Cleeper", "Enderman"};

>>>>>>> 278dc43874e08303789086f0fd7006a1689735bd
    return monster[mNumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
