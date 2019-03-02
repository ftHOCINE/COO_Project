package fil.coo.Action;
/**
 * Hello world!
 *
 */
public  class  SequentielScheduler extends Scheduler
{
	public SequentielScheduler ( ){
		super();
		

	}
	
	public  Action nextAction(){
		
		return this.actions.get(0);
	}
		
	public  void removeAction(Action a){
		   this.actions.remove(0);
	
	}
		}
	
	
	

