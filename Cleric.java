//Let the healing begin.
public class Cleric extends Character {

    public Cleric() {
	name = "holyPerson";
	HP = 75;
	MP = 175;
	strength = 20;
	defense = 20;
	attack = 0.2;
	speed = 40;
	smarts = 100;
	accuracry = .8;
    }

    public Cleric(String s) {
	this();
	name = s;
    }

    public void heal() {
	strength = 10;
	defense = 10;
	attack = 0.15;
	HP = 75;
    }

}
