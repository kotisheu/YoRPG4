public class Boss extends Character {

    private String _name;

    public Boss() {
    		_name= "Boss";	
	    _hp = 250;
	    _defense = 30;
	    _attack = 1.5;
	    _strength = (int) (20 + (65 * Math.random()));
	    _level = 1;
    }

  public String getName(){
  	return _name;
  }
    public void normalize(){
    	
    }
    public  void skill(){
    	
    }
    public String about(){
    	String desc = "The big, bad boss.";
    	return desc;
    }
    
    public void statsUp(){
    	
    }
}
