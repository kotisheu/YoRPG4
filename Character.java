public abstract class Character{

// Attributes:
    protected int _hp, _mp, _strength, _defense, _speed, _smarts, _level, _exp;
    protected double _attack, _accuracy;

// Methods:
		public boolean isAlive(){
			return _hp > 0;
    }
    public int getDefense(){
			return _defense;
    }
    public int getAccuracy(){
    	return _accuracy;
    }
    public int lowerHP(int i){
			_hp-=i;
			return _hp;
    }
    
    public int attack(Character _character){
	int damage = (int) ( (_strength * _attack) - _character.getDefense() );
	int _dodge = (int) (100 * Math.random());		
      if (damage < 0)
      	damage = 0;
      	if (_dodge > _character.getAccuracy)
      		damage = 0;
        _character.lowerHP(damage);
	  	return damage;
    }
    //^dodge was put into the attack method cuz that's really the only easy way
    
    ~expup
    
    public abstract String getName();
    public abstract void normalize();
    public abstract void specialize(); //->skill?
    
    public abstract String about();
	> Shouldn't about be abstract/for each class
    public static String about() {
	String desc = "";
        desc += "Warrior: A fine soul that hath a sword to parry and slash with.";
	desc += "/nMonster: An evil being drawn up from the Underworld, lurking in shadows and scaring the fair maids.";
	desc += "/nRogue: A thief that swipes items from good, innocent victims to battle cleverly against the cruelty of reality.";
	desc += "/nMage: A skilled magician that casts spells learned from the great world of Dumbledore.";
	return desc;
    }
    
    public abstract void levelUp();

}
