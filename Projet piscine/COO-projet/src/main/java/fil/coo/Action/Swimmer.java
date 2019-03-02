package fil.coo.Action;
import fil.coo.ResourcePool.*;
import fil.coo.ResourceUser.*;
import fil.coo.Resource.*;
public class Swimmer extends SequentielScheduler
{
	
	private String name;
	private BasketPool basketAdministrator;
	private CubiclePool cubicleAdministrator;
	private int undressTime;
	private int bathTime;
	private int dressTime;
	
	private ResourceUser<Basket> basket;
	private ResourceUser<Cubicle> cubicle;
	
	/**
	 * Constructor of a new swimmer
	 * @param name the name of this swimmer
	 * @param bA the basket pool of this swimmer
	 * @param cA the cubicle pool of this swimmer
	 * @param undressTime the undress time of this swimmer
	 * @param bathTime the bath time of this swimmer
	 * @param dressTime the dress time of this swimmer
	 */
	public Swimmer(String name, BasketPool bA, CubiclePool cA, int undressTime, int bathTime, int dressTime) {
		
		super();
		this.name = name;
		this.basketAdministrator = bA;
		this.cubicleAdministrator = cA;
		this.undressTime = undressTime;
		this.bathTime = bathTime;
		this.dressTime = dressTime;
		
		this.basket = new ResourceUser<Basket>();
		this.cubicle = new ResourceUser<Cubicle>();
		
		this.addAction(new TakeResourceAction<Basket>(this.basketAdministrator, this.basket,this.name));
		this.addAction(new TakeResourceAction<Cubicle>(this.cubicleAdministrator, this.cubicle,this.name));
		this.addAction(new ForeseableAction(this.undressTime,"undressing "));
		this.addAction(new FreeResourceAction<Cubicle>(this.cubicleAdministrator, this.cubicle,this.name));
		this.addAction(new ForeseableAction(this.bathTime,"swimming "));
		this.addAction(new TakeResourceAction<Cubicle>(this.cubicleAdministrator, this.cubicle,this.name));
		this.addAction(new ForeseableAction(this.dressTime,"dressing "));
		this.addAction(new FreeResourceAction<Cubicle>(this.cubicleAdministrator, this.cubicle,this.name));
		this.addAction(new FreeResourceAction<Basket>(this.basketAdministrator, this.basket,this.name));
		
	
	}
	public String getName() {
		return this.name;
	}
	public void doStep() throws ActionFinishedException {
		
		System.out.println(this.getName()+"'s turn ");
		super.doStep();
	}
	
	
}




