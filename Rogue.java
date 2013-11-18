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
    _level = 1;
    _exp = 0;
  }
  
  public Rogue(String s) {
    this();
    _name = s;
  }
  
  public void statsUp() {
    _hp *= 1.2;
    _mp *= 1.2;
    _defense *= 1.2;
    _smarts *= 1.2;
  }
  
  public String about() {
    String desc = "A theif who swipes items from good, innocent victims to battle against the cruelty of reality and monsters.";
    return desc;
  }

}
