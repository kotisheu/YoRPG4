//Let the healing begin..
public class Cleric extends Character {

    public Cleric() {
			_name = "holyPerson";
			_hp = 75;
			_MP = 175;
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

    public void heal() {
			_strength = 10;
			_defense = 10;
			_attack = 0.15;
			_hp = 75;
			_mp -= 25;
    }

}
