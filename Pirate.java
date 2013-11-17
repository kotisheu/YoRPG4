public class Pirate extends Character {

  public Pirate() {
    name = "redBeard";
    HP = 125;
    MP = 75;
    strength = 85;
    defense = 40;
    attack = .4;
    speed = 80;
    smarts = 50;
    accuracy = .85;
  }
  
  public Pirate(String s) {
    this();
    name = s;
  }

}
