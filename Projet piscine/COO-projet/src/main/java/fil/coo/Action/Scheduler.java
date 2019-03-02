package fil.coo.Action;
import java.util.*;
/**
 * Hello world!
 *
 */
public  abstract class  Scheduler extends Action
{
	protected LinkedList<Action> actions;
	
	public abstract Action nextAction();
	public abstract void removeAction(Action a);
	
	
	
	public Scheduler (){
	super();
	this.actions=new LinkedList<Action>();}
	
	
	
	public boolean isFinished() {
		return this.actions.isEmpty();
	}
	
	public void process() throws ActionFinishedException{
			Action a=this.nextAction();
			a.doStep();
          if(a.isFinished()){
			  this.removeAction(a);
			  }
		  }
		
    public boolean stopCondition(){
		return this.state ==ActionState.IN_PROGRESS && this.actions.isEmpty();
		}	
    public void addAction(Action a) {
    if (a.getState() == ActionState.READY) {
    	this.actions.add(a);}
    }
    public List<Action> get() {
    	return this.actions;
    }
	
		}
	
	
	

