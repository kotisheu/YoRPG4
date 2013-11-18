public class Pirate extends Character {

  public Pirate() {
    _name = "redBeard";
    _hp = 125;
    _mp = 75;
    _strength = 85;
    _defense = 40;
    _attack = .4;
    _speed = 80;
    _smarts = 50;
    _accuracy = .85;
    _level = 1;
    _exp = 0;
  }
  
  public Pirate(String s) {
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
    _attack += (_level * .01 + _smarts * .01);
    _defense -= (_level * 3 + _smarts * .01);
  }
          
  public void normalize() {
    _attack = 0.4;
    _defense = 40;
  }
  
  public String about() {
    String desc = "A landlubber who sails the seas, shooting sea monsters with his gun in search of their booty.";
    return desc;
  }

}
