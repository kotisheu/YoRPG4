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
  }
  
  public Archer(String s) {
    this();
    _name = s;
  }
  
  public void levelUp() {
    _hp *= 1.2;
    _mp *= 1.2;
    _defense *= 1.2;
    _smarts *= 1.2;
  }
  
}
