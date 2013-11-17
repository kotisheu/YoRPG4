public class Monster1 extends Character {

    private String name;

    public Monster1() {
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
