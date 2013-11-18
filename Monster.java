public class Monster extends Character {

    public Monster(Character c) {
    		_name="minion";
	    _hp = _level*100;
	    _defense = _level*20;
	    _attack = 1;
	    _strength = (int) (_level*5 + (45 * Math.random()));
	    _speed=30;
	    _level = c.getLevel() + (int)(Math.random()*3);
	    _exp= _level;
	    _accuracy= .70;
    }

 public String getName(){
 	return _name;
 }
    public void normalize(){
    }
    
    public void skill(){
    	
    }
    public String about(){
    	String desc = "The evil, hearthless beast causes destruction where it goes.";
    	return desc;
    }
    
    public void statsUp(){
    }
    
}
