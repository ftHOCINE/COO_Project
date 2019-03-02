package FIl.Items;
import FIl.Room.*;
import FIl.GameCharacter.*;
import FIl.ListChoser.*;
import FIl.Actions.*;
import java.util.Random;
/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * BanditMAnchot class represents an item that take from the player gold point and give him one of the other items
 */
public class BanditManchot implements Items{
	private int Point;
	Random random = new Random();
	
	public BanditManchot(){
	this.Point=random.nextInt(25);
	}
			/**
	* the player paye this item whith gold point and get another item in exchange
	* @param  P the player 
	*/
	public void usedBy(Player P){
	int choice;
	choice = random.nextInt(3) + 1;
	int bonus;
	bonus = random.nextInt(50);
	if (P.getPointOr()>=this.Point){
	P.changePointOr(P.getPointOr()-this.Point);
	if (choice == 1){
		P.changeForce(P.getForce()+bonus);}
	if (choice == 2){
		P.changePointV(P.getPointv()+bonus);}
	if (choice == 3){
		P.changePointOr(P.getPointOr()+bonus);}
	}
	else {
			System.out.println("you don't have enough gold point");
		}
	}
		 /**
	* get the name of the item
	* @return String name
	*/
	public String toString(){
		return "Bandit Manchot";
	}
	}
