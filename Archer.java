public class Archer extends Character {

  public Archer() {
    _name = "robinHood";
    _HP = 85;
    _MP = 75;
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

}
