public class Timer{
	public static final boolean DEBUG = false;
	private Double start;//Double of what time start is

	public Timer(){
		if(DEBUG){System.out.println("instance of Timer made");}
		start = new Double(System.currentTimeMillis()); //Inits timer with current start time
	}

	public void setTime(){
		if(DEBUG){System.out.println("Time|Set");}
		start = new Double(System.currentTimeMillis()); //Sets start time
	}

	public Double getTime(){
		double currentTime = System.currentTimeMillis() - start; //Gets start time
		if(DEBUG){System.out.println("Time returned = " + currentTime);}
		return currentTime;
	}

}