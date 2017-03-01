public class Timer{
	public static final boolean DEBUG = false;
	private Double start;

	public Timer(){
		if(DEBUG){System.out.println("instance of Timer made");}
		start = new Double(System.currentTimeMillis());
	}

	public void setTime(){
		if(DEBUG){System.out.println("Time|Set");}
		start = new Double(System.currentTimeMillis());
	}

	public Double getTime(){
		double currentTime = start - System.currentTimeMillis();
		if(DEBUG){System.out.println("Time returned = " + currentTime);}
		return currentTime;
	}

}