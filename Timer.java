public class Timer{
	
	private Double start;

	public Timer(){
		start = new Double(System.currentTimeMillis());
	}

	public void setTime(){
		start = new Double(System.currentTimeMillis());
	}

	public Double getTime(){
		return start;
	}

}