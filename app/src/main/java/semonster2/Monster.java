
package semonster2;

public class Monster {
  private String name;
  private int rare; // 珍しさ

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
  }

  String summonMonster(int mNumber) {
    String monster[] = {"Zombie", "Skelton", "Cleeper", "Enderman"};
    return monster[mNumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
