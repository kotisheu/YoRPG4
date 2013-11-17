public abstract class Character{

// Attributes:
    protected int _hp; 
    protected int _mp; 
    protected int _strength;
    protected int _defense;
    protected double _attack;
    protected int _speed;
    protected int _smarts;
    protected double _accuracy;

// Methods:
		public boolean isAlive(){
			return _hp > 0;
    }
    public int getDefense(){
			return _defense;
    }
    public int lowerHP(int i){
			_hp-=i;
			return _hp;
    }
    
    public int attack(Character _character){
			int damage = (int) ( (_strength * _attack) - _character.getDefense() );
      if (damage < 0)
      	damage = 0;
        _character.lowerHP(damage);
	  	return damage;
    }
    ~dodge
    ~expup
    ~abstract levelup
    public abstract String getName();
    public abstract void normalize();
    public abstract void specialize();->skill?
    public abstract String about();
	> Shouldn't about be abstract/for each class
    public static String about() {
	String desc = "";
        desc += "Warrior: A fine soul that hath a sword to parry and slash with.";
	desc += "/nMonster: An evil being drawn up from the Underworld, lurking in shadows and scaring the fair maids.";
	desc += "n/Rogue: A thief that swipes items from good, innocent victims to battle cleverly against the cruelty of reality.";
	desc += "n/Mage: A skilled magician that casts spells learned from the great world of Dumbledore.";
	return desc;
    }

}
