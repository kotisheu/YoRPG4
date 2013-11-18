public class Boss extends Character {

    private String _name;

    public Boss() {
    		_name= Boss;	
	    _hp = 250;
	    _defense = 15;
	    _attack = 1.5;
	    _strength = (int) (20 + (65 * Math.random()));
    }

  public String getName(){
  	return _name;
  }
    public void normalize(){
    	
    }
    public  void skill(){
    	
    }
    public String about(){
    	return " The big and the bad Boss.";
    	
    }
    public void statsUp(){
    	
    }
}
