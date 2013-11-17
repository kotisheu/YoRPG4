public class Monster1 extends Character {

    private String _name;

    public Monster1() {
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

}
