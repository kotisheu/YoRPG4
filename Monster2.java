public class Monster2 extends Character {

    private String _name;

    public Monster2() {
	    _hp = 250;
	    _defense = 15;
	    _attack = 1.5;
	    _strength = (int) (15 + (40 * Math.random()));
    }

    public void specialize () {
	    ;
    }

    public void normalize () {
    	;
    }

}
