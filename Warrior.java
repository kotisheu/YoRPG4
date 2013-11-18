public class Warrior extends Character{

    public Warrior() {
	_name = "grimReaper";
	_hp = 150;
	_mp = 50;
	_strength = 100;
	_defense = 75;
	_attack = 0.6;
	_speed = 40;
	_smarts = 20;
	_accuracy = 0.7;
    }

    public Warrior(String s) {
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
