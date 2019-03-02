package FIl;
import FIl.Room.*;
import FIl.GameCharacter.*;
import FIl.GameCharacter.Monstre;
import FIl.ListChoser.*;
import FIl.Actions.*;
import FIl.Items.*;
import FIl.AdventureGame.*;

/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * The Main class 
 */
public class Main{
	public static void main( String[] args){
		   
	   /**
	    * Initialization of monsters
	    **/
		   Monstre m0 = new Monstre("monster_easy1",5,2,5);
		   Monstre m1 = new Monstre("monster_easy2",5,5,6);
		   Monstre m2 = new Monstre("monster_easy3",5,5,8);
		   Monstre m3 = new Monstre("monster_medium1",11,5,8);
		   Monstre m4 = new Monstre("monster_medium2",11,10,10);
		   Monstre m5 = new Monstre("monster_medium3",12,15,10);
		   Monstre m6 = new Monstre("monster_medium4",15,16,12);
		   Monstre m7 = new Monstre("monster_hard1",15,17,15);
		   Monstre m8 = new Monstre("monster_hard2",19,18,20);
		   Monstre m9 = new Monstre("monster_hard3",21,19,25);
		   Monstre m10 = new Monstre("monster_hard4 the_LEADER",35,20,30);
		   
		/**
	    * Initialization of iteams
	    **/
		   PotionVie pv= new PotionVie(15);
		   PotionOr pr= new PotionOr(10);
		   PotionForce pf= new PotionForce(10);
		   BanditManchot bd = new BanditManchot();
		   
		/**
	    * Initialization of Rooms
	    **/
		   Room r0= new Room("r0");
		   r0.addObject(pv);
		   r0.addMonstre(m0);
		   Room r1= new Room("r1");
		   r1.addObject(pf);
		   r1.addMonstre(m1);
		   Room r2= new Room("r2");
		   r2.addObject(pr);
		   r2.addMonstre(m2);
		   Room r3= new Room("r3");
		   r3.addObject(pv);
		   r3.addMonstre(m2);
		   r3.addMonstre(m1);
		   Room r4= new Room("r4");
		   r4.addObject(bd);
		   r4.addObject(pv);
		   r4.addMonstre(m3);
		   Room r5= new Room("r5");
		   r5.addObject(pv);
		   r5.addObject(pf);
		   r5.addObject(pr);
		   r5.addMonstre(m4);
		   Room r6= new Room("r6");
		   r6.addObject(bd);
		   r6.addMonstre(m5);
		   Room r7= new Room("r7");
		   r7.addObject(pv);
		   r7.addMonstre(m6);
		   Room r8= new Room("r8");
		   r8.addObject(pf);
		   r8.addMonstre(m6);
		   r8.addMonstre(m5);
		   Room r9= new Room("r9");
		   r9.addObject(pv);
		   r9.addObject(bd);
		   r9.addMonstre(m7);
		   Room r10= new Room("r10");
		   r10.addObject(pv);
		   r10.addMonstre(m8);
		   r10.addMonstre(m9);
		   Room r11= new Exit("Exit");
		   r11.addObject(pv);
		   r11.addObject(bd);
		   r11.addMonstre(m10);
		   
		   r0.addNeighbor(Direction.NORTH,r1);
		   r1.addNeighbor(Direction.SOUTH,r0);
		   r1.addNeighbor(Direction.NORTH,r2);
		   r2.addNeighbor(Direction.SOUTH,r1);
		   r2.addNeighbor(Direction.EAST,r3);
		   r3.addNeighbor(Direction.WEST,r2);
		   r3.addNeighbor(Direction.NORTH,r4);
		   r4.addNeighbor(Direction.SOUTH,r3);
		   r4.addNeighbor(Direction.EAST,r5);
		   r5.addNeighbor(Direction.WEST,r4);
		   r5.addNeighbor(Direction.NORTH,r7);
		   r7.addNeighbor(Direction.SOUTH,r5);
		   r4.addNeighbor(Direction.NORTH,r6);
		   r6.addNeighbor(Direction.SOUTH,r4);
		   r6.addNeighbor(Direction.EAST,r7);
		   r6.addNeighbor(Direction.NORTH,r9);
		   r7.addNeighbor(Direction.WEST,r6);
		   r7.addNeighbor(Direction.NORTH,r8);
		   r8.addNeighbor(Direction.SOUTH,r7);
		   r9.addNeighbor(Direction.SOUTH,r6);
		   r8.addNeighbor(Direction.WEST,r9);
		   r9.addNeighbor(Direction.EAST,r8);
		   r9.addNeighbor(Direction.WEST,r10);
		   r10.addNeighbor(Direction.EAST,r9);
		   r9.addNeighbor(Direction.NORTH,r11);
		   r11.addNeighbor(Direction.SOUTH,r9);
	    /**
	    * Initialization of player
	    **/
		   Player P= new Player(110,10,15,r0);
		/**
	    * Initialization of AdventureGame
	    **/
		   AdventureGame adg= new AdventureGame(P);
		   adg.setCurrentRoom(r0);
		   adg.play(P);
		/**
	    * the game begin
	    **/
	    
		   System.out.println(" ");
		   System.out.println("۞ ۞ ۞   Welcome ۞ ۞ ۞ ");
		   System.out.println(" ");
		   System.out.println(" ╬  ╬  The game has begin  ╬  ╬  ");
		   System.out.println(" ");
		   System.out.println("ஐ  you are in the beginning of the game in a room which is called '"+ r0.toString()+"' good luck ஐ " );
		   System.out.println(" ");
		   while(!adg.isFinished()){
			   P.act();
			   adg.RoomsAction();
		   }
		   if(!P.isDead()){
			System.out.println("^~~~~ Congratulations, You Win :) !!!!! ~~~~^");
		  }
			else{
		   System.out.println("****** Game Over :( ****** ");
			}   
		  
		   
	   }
   }
		   
		   
