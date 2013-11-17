public abstract class Character{
// Attributes:
    protected int hp; 
    protected int mp; 
    protected int strength;
    protected int defense;
    protected double attack;
    ~speed;
    ~smarts
    ~accuracy
// Methods:
 public boolean isAlive(){
	return hp>0;
    }
    public int getDefense(){
	return defense;
    }
    public int lowerHP(int i){
	hp-=i;
	return hp;
    }
    public int attack(Character c ){
          double damage = (strength * attack) - c.getDefense();
	  return (int)damage;
    }
    ~dodge
    ~expup
    ~abstract levelup
    public abstract String getName();
    public abstract void normalize();
    public abstract void specialize();->skill?
    public abstract String about();
	> Shouldn't about be sbstract/for each class
    public static String about() {
	String desc = "";
        desc += "Warrior: A fine soul that hath a sword to parry and slash with.";
	desc += "/nMonster: An evil being drawn up from the Underworld, lurking in shadows and scaring the fair maids.";
	desc += "n/Rogue: A theif that swipes items from good, innocent victims to battle cleverly against the cruelty of reality.";
	desc += "n/Mage: A skilled magician that casts spells learned from the great world of Dumbledore.";
	return desc;
    }

}
