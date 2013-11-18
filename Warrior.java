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
		_level = 1;
    		_exp = 0;
    	}

    	public Warrior(String s) {
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
  		_attack += (_level * .1 + _smarts * .05);
  		_defense -= (_level * 3 + _smarts * .01);
  	}
  	
  	public void normalize() {
  		_attack = 0.6;
  		_defense = 75;
  	}
  	
  	public String about() {
  		String desc = "A fine soul that hath a sword to slay and parry beasts that roam.";
  		return desc;
  	}
 
}
