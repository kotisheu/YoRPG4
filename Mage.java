public class Mage extends Character {

  public Mage() {
    _name = "Dumbledore";
    _hp = 85;
    _mp = 200;
    _strength = 40;
    _defense = 30;
    _attack = .8;
    _speed = 60;
    _smarts = 100;
    _accuracy = .75;
    _level = 1;
    _exp = 0;
  }
  
  public Mage(String s) {
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
    _attack += (_level * .01 + _smarts * .007);
    _accuracy += (_level * .01 + _smarts * .005);
    _defense -= (_level * 3 + _smarts * .01);
  }
          
  public void normalize() {
    _attack = .8;
    _accuracy = 0.75;
    _defense = 30;
  }
  
  public String about() {
    String desc = "A skilled magician that casts learned from the great realm of Hogwarts. Muggles and monsters, beware.";
    return desc;
  }

}
