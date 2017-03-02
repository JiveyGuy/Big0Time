/**
	@author Jason Ivey

	Function tester tests the function class using
	the Timer object.
*/
import java.util.Random;
import java.util.PriorityQueue;

public class FunctionTester{

	public static final boolean DEBUG = true;	
	public static void main(String args[]){

		if (DEBUG) System.out.println("Called for:  " + args[0] + " : " + args[1]);
		
		PriorityQueue<Double> brute = new PriorityQueue<Double>();
		PriorityQueue<Double> quad = new PriorityQueue<Double>();
		PriorityQueue<Double> kaine = new PriorityQueue<Double>();
		
		int size      = Integer.parseInt(args[0]); //Size of array
		int tests     = Integer.parseInt(args[1]); //# of tests to run
		int rate      = 2;

		int[] array   = randomGen(size); //Makes array

		Timer timer   = new Timer();
		Double time[] = new Double[3];


		for(int testsCompleted = 0; testsCompleted < 10; testsCompleted++){

	

			for(int iterations = 0; iterations < size; iterations++){
			
				timer.setTime();
				Functions.funcOne();
				brute.add(timer.getTime());
				
				timer.setTime();
				Functions.funcTwo();
				quad.add(timer.getTime());
				
				timer.setTime();
				Functions.funcThree();
				kaine.add(timer.getTime());

			} 

			

			size = size * rate; //Increasing by the rate
			array = randomGen(size); //New array huray! 
		}
	}
	public static int[] randomGen(int size){

    	if (DEBUG) System.out.println("Random gen = " + size + " ");
    	int[] result = new int[size];
    	Random rand = new Random();
    
    	for(int iterations = 0; iterations < size; iterations++){
      
      		result[iterations] = rand.nextInt(500) + 1;
     		 if (DEBUG) System.out.println("Random Loop " + iterations + " : " + result[iterations]);
    
    	}
	
	public void Print(int func, PriorityQueue<Double> input){
		Double[] array = input.toArray();
		System.out.println(For func #" + func + " lowest = " + array[0] + " highest
		
	}
    
    	return result; 
  	}

}
