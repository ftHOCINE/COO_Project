package fil.coo.Action;
/**
 * Hello world!
 *
 */
public   class  ForeseableAction extends Action
{
	private int time;
	private int cpt;
	private String s;
	public ForeseableAction(int time,String s){
		super();
		this.time=time;
		this.cpt=0;
		this.s=s;
	}
	
	public int getTime(){
		return this.cpt;
	}
	
	public void process() throws ActionFinishedException{
		this.cpt++;
		System.out.println(" "+s+"("+getTime()+"/"+this.time+") ");
		
		  }
		
    public boolean stopCondition(){
		return this.cpt ==this.time;
		}	
	
		}
	
	
	

