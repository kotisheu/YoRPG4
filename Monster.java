public class Monster extends Character {

    private String _name;

    public Monster() {
	    _hp = 150;
	    _defense = 20;
	    _attack = 1;
	    _strength = (int) (20 + (45 * Math.random()));
    }

    public void specialize() {
	    ;
    }

    public void normalize() {
    	;
    }
    
    public void statsUp() {
    	;
    }

}
