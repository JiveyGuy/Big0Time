/**
	@author Jason Ivey

	Function tester tests the function class using
	the Timer object.
*/
import java.util.Random;

public class FunctionTester{

	public static final boolean DEBUG = false;	
	public static void main(String args[]){

		if (DEBUG) System.out.println("Called for:  " + args[0] + " : " + args[1]);


		int size      = Integer.parseInt(args[0]); //Size of array
		int tests     = Integer.parseInt(args[1]); //# of tests to run
		int rate      = 2;

		int[] array   = randomGen(size); //Makes array

		Timer timer   = new Timer();
		Double time[] = new Double[3];

		time[0] = new Double(0.0);
		time[1] = new Double(0.0);
		time[2] = new Double(0.0); //Our time holders to sum time

		

		for(int testsCompleted = 0; testsCompleted < 10; testsCompleted++){

			PecanTree bruteTree = new PecanTree();
			PecanTree quadTree = new PecanTree();
			PecanTree kTree = new PecanTree();

			for(int iterations = 0; iterations < size; iterations++){

				timer.setTime();
				Functions.funcOne(array);
				bruteTree.bud(timer.getTime());

				timer.setTime();
				Functions.funcTwo(array);
				quadTree.bud(timer.getTime());

				timer.setTime();
				Functions.funcThree(array);
				kTree.bud(timer.getTime(););

			} 
			Double values[][] = new Doble[3][3];

			values[0] = populateValues(bruteTree);
			values[1] = populateValues(quadTree);
			values[2] = populateValues(kTree);

			size = size * rate; //Increasing by the rate
			array = randomGen(size); //New array huray! 
		}
	}

	public static Double[] populateValues(PecanTree pecanTree){
		Double[] values = new Double[3];

		values[0] = pecanTree.getMin();
		values[1] = pecanTree.getAverage();
		values[2] = pecanTree.getMax());
		
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

}