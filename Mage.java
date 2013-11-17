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
  }
  
  public Mage(String s) {
    this();
    _name = s;
  }
  
  public void levelUp() {
    _hp += 17;
    _mp += 40;
  }

}
