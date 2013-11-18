// The mother of all classes is here.

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
    _level = 1;
    _exp = 0;
  }
  
  public Tank(String s) {
    this();
    _name = s;
  }
  
  public void statsUp() {
    _hp *= 1.2;
    _mp *= 1.2;
    _defense *= 1.2;
    _smarts *= 1.2;
  }
  
  public void skill() {
    _attack += (_level * .02 + _smarts * .01);
    _defense += (_level * 2 + _smarts * .01);
    _accuracy -= (_level * .03 + _smarts * .01)
  }
          
  public void normalize() {
    _attack = 0.25;
    _defense = 100;
    _accuracy = .65;
  }
  
  public String about() {
    String desc = "A giant steel machine that lumbers through the world, righting evils with its cannon. Take heed.";
    return desc;
  }

}
