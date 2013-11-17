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
  }
  
  public Pirate(String s) {
    this();
    _name = s;
  }

}
