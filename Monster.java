public class Monster extends Character {

    private String name;

    public Monster() {
	    health = 150;
	    defense = 20;
	    attackRating = 1;
	    strength = (int) (20 + (45 * Math.random()));
    }

    public void specialize() {
	    ;
    }

    public void normalize() {
    	;
    }

}
