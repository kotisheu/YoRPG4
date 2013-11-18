import java.io.*;
import java.util.*;

public class YoRPG {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    public final static int MAX_ENCOUNTERS = 200;

    //each round, a Warrior and a Monster will be instantiated
    private Character pat;   //Is it man or woman?
    private Character smaug; //Friendly generic monster name, eh?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG() {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    public void newGame() {

	String s;
	String name = "";
	s = "Welcome to Ye Olde RPG!\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	


	s="Intrepid adventurer, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	s = "Very well.\n";
	s+= " Which class would you like to partake in?\n";
	s+="\t1: A powerful warrior.\n";
	s+="\t2: A fearless tank.\n";
	s+="\t3: A mystical mage.\n";
	s+="\t4: A stealthy rogue.\n";
	s+="\t5: A precise archer .\n";
	s+="\t6: An agressive pirate.\n";
	s+="\t7: A benevolent cleric.\n";
	s+= "Selection: ";
	System.out.print( s );
        try {
	    String c =in.readLine() ;
	    if (c.equals("1")){
		pat = new Warrior( name );}
	    if (c.equals("2")){
		pat = new Tank( name );}
	    if (c.equals("3")){
		pat = new Mage( name );}
	    if (c.equals("4")){
		pat = new Rogue( name );}
	    if (c.equals("5")){
		pat = new Archer( name );}
	    if (c.equals("6")){
		pat = new Pirate( name );}
	    if (c.equals("7")){
		pat = new Cleric( name );}
	}
	catch ( IOException e ) { }


    }


    public boolean playTurn() {

	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "Nothing to see here. Move along!" );

	else {
	    if (Math.random() >=.95){
		smaug= new Boss(pat);}
	    else{
		smaug = new Monster(pat);}
	    System.out.println( "Lo, yonder a level "+smaug.getLevel()+" monster approacheth!" );
	    
	    while( smaug.isAlive() && pat.isAlive()  ) {	   
		int cspeed=pat.getSpeed();              
		int sspeed= smaug.getSpeed();

		try {
		    System.out.println( "Would you like to use a skill?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 ){
		    pat.skill();}

		while(( cspeed- 30) >=0){
		     d1 = pat.attack( smaug );
		    smaug.lowerHP(d1);
		    System.out.println( pat.getName() + " dealt " + d1 +
					" points of damage.");
		    cspeed-=30;}
		if ((cspeed * Math.random())>7){
		     d1 = pat.attack( smaug );
		    smaug.lowerHP(d1);
		    System.out.println( pat.getName() + " dealt an extra " + d1 +
					" points of damage.");}
		while((sspeed- 30) >=0){
		    d2 = smaug.attack( pat );
		    pat.lowerHP(d2);
		    System.out.println( "Ye Olde Monster hit back for " + d2 +
					" points of damage.");
		    sspeed-=30;}
		if ((sspeed*Math.random())>7){
		     d2 = smaug.attack( pat );
		    pat.lowerHP(d2);
		    System.out.println( "Ye Olde Monster hit back for " + d2 +
					" points of damage.");}
		pat.normalize();
		}//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		String d= "HuzzaaH! Ye olde monster hath been slain!";
		d+= "You have gained "+ pat.expUp(smaug)+" experience!";
		System.out.println (d);
		pat.levelUp();//levels up pat, if qualifies
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
  

    public static void main( String[] args ) {


	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );


    }//end main

}//end class YoRPG


