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
    public int lowerHP(int i){
			_hp-=i;
			return _hp;
    }
    public int getExp(){
    	return _exp;
    }
    public
    public int attack(Character c){
    	if hit(){
		int damage = (int) ( (_strength * _attack) - c.getDefense() );
      		if (damage < 0)
      			damage = 0;
		 _character.lowerHP(damage);
	  		return damage;
    	}return 0;
    }
    public void levelUp(){
    	if (_exp == _level*10)){
    		_level++;
    		statsUp();}
    		
    	}
    public boolean hit(){
    	return (((int)(Math.random() * 100)) <= _accuracy)
    }
    public boolean expup(Character c){
    	_exp += c.getExp(); //add monster exp to character exp
    }
    
    
    public abstract String getName();
    public abstract void normalize();//see below
    public abstract void skill();// equivalant of specialize I guess, just more generalized Use *stat*+= x, so normalize can be *stat* -= x
    public abstract String about();
    public abstract void statsUp();//  make each stat like 1/5 th higher? 

}
