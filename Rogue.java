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
  
    public String getName() {
    return _name;
  }
  
  public void statsUp() {
    _hp *= 1.2;
    _mp *= 1.2;
    _defense *= 1.2;
    _smarts *= 1.2;
  }
  
  public void skill() {
    _attack += (_smarts * .05);
    _defense -= (_level * 3 + _smarts * .01);
  }
          
  public void normalize() {
    _attack = 0.35;
    _defense = 50;
  }
  
  public String about() {
    String desc = "A thief who swipes items from good, innocent victims to battle against the cruelty of monsters and reality.";
    return desc;
  }

}
