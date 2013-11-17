public class Monster extends Character {

    private String name;

    public Monster2() {
	    health = 250;
	    defense = 15;
	    attackRating = 1.5;
	    strength = (int) (15 + (40 * Math.random()));
    }

    public void specialize () {
	    ;
    }

    public void normalize () {
    	;
    }

}
