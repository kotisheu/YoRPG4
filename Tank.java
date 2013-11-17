// The mother of all subclasses is here.

public class Tank extends Character {

  public Tank() {
    name = "megatron";
    HP = 200;
    MP = 50;
    strength = 70;
    defense = 100;
    attack = .25;
    speed = 30;
    smarts = 20;
    accuracy = .65;
  }
  
  public Tank(String s) {
    this();
    name = s;
  }

}
