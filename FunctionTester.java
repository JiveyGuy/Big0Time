/**
	@author Jason Ivey

	Function tester tests the function class using
	the Timer object.
*/
import java.util.Random;
import java.util.PriorityQueue;
import java.util.Arrays;

public class FunctionTester{

	public static final boolean DEBUG = false;	
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
		time[0] = new Double(0.0);
		time[1] = new Double(0.0);
		time[2] = new Double(0.0);


		for(int testsCompleted = 0; testsCompleted < tests; testsCompleted++){

	

			for(int iterations = 0; iterations < 10; iterations++){
			
				timer.setTime();
				Functions.funcOne(array);
				time[0] += timer.getTime();
				
				timer.setTime();
				Functions.funcTwo(array);
				time[1] += timer.getTime();
				
				timer.setTime();
				Functions.funcThree(array);
				time[2] += timer.getTime();

			} 

			brute.add(time[0] / 10);
			time[0] = 0.0;
			quad.add(time[1] / 10);
			time[1] = 0.0;
			kaine.add(time[2] / 10);
			time[2] = 0.0;

			print(1, brute, size);
			print(2, quad, size);
			print(3, kaine, size);

			brute.clear();
			quad.clear();
			kaine.clear();

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
    	return result;
    }
	
	public static void print(int func, PriorityQueue<Double> input, int size){
		Double[] array = new Double[size];
		array = input.toArray(array);
		Arrays.sort(array);
		System.out.println(array[0] + " : " + array[array.length]);
	}
}
