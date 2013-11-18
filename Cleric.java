//Let the healing begin.
public class Cleric extends Character {

    public Cleric() {
			_name = "holyPerson";
			_hp = 75;
			_mp = 175;
			_strength = 20;
			_defense = 20;
			_attack = 0.2;
			_speed = 40;
			_smarts = 100;
			_accuracy = .8;
    }

    public Cleric(String s) {
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
			_attack = 0.0;
			_hp += 25;
			_mp -= 25;
    }

}
