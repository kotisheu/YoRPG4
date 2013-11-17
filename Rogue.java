public class Rogue extends Character {

  public Rogue() {
    _name = "ninjaBob";
    _hp = 100;
    _mp = 100;
    _strength = 70;
    _defense = 50;
    _attack = .35;
    _speed = 90;
    _smarts = 40;
    _accuracy = .85;
  }
  
  public Rogue(String s) {
    this();
    _name = s;
  }
  
  public void levelUp() {
    _hp += 20;
    _mp += 20;
  }

}
