public class Monster extends Character {

    private String _name;

    public Monster() {
    		_name="minion"
	    _hp = 150;
	    _defense = 20;
	    _attack = 1;
	    _strength = (int) (20 + (45 * Math.random()));
    }

 public abstract String getName(){
 	return _name;
 }
    public abstract void normalize(){
    }
    
    public abstract void skill(){
    	
    }
    public abstract String about(){
    	return " The boss's little henchmen."
    }
    public abstract void statsUp(){
    }
    
}
