public class Archer extends Character {

  public Archer() {
    _name = "robinHood";
    _hp = 85;
    _mp = 75;
    _strength = 80;
    _defense = 40;
    _attack = .55;
    _speed = 90;
    _smarts = 60;
    _accuracy = .95;
    _level = 1;
    _exp = 0;
  }
  
  public Archer(String s) {
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
    _accuracy += (_level * .01 + _smarts * .01);
    _defense -= (_level * 3 + _smarts * .01);
  }
          
  public void normalize() {
    _accuracy = 0.95;
    _defense = 40;
  }
  
  public String about() {
    String desc = "A lighthearted lad with 20/20 vision who can impale foes from faraway distances with his bow and arrows.";
    return desc;
  }
}
