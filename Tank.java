// The mother of all subclasses is here.

public class Tank extends Character {

  public Tank() {
    _name = "megatron";
    _hp = 200;
    _mp = 50;
    _strength = 70;
    _defense = 100;
    _attack = .25;
    _speed = 30;
    _smarts = 20;
    _accuracy = .65;
  }
  
  public Tank(String s) {
    this();
    _name = s;
  }
  
  public void levelUp() {
    _hp += 40;
    _mp += 5;
  }

}
