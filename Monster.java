public class Monster extends Character {

    private String _name;

    public Monster() {
    		_name="minion";
	    _hp = 150;
	    _defense = 20;
	    _attack = 1;
	    _strength = (int) (20 + (45 * Math.random()));
    }

 public String getName(){
 	return _name;
 }
    public void normalize(){
    }
    
    public void skill(){
    	
    }
    public String about(){
    	return " The boss's little henchmen.";
    }
    public void statsUp(){
    }
    
}
