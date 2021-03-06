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
		
		
		int size      = Integer.parseInt(args[0]); //Size of array
		int tests     = Integer.parseInt(args[1]); //# of tests to run
		int rate      = 2;

		int[] array   = randomGen(size); //Makes array

		Timer timer   = new Timer(); //Our timer object 
		/* Data[0] = function One
		 * Data[0][0] = is average time
		 * Data[0][1] = is max time
		 * Data[0][2] = is min time
		 * Same for other functions just incrimenting first pointer
		 */
		Double data[][] = new Double[3][3]; 


		Double temp = new Double(0.0); //Temp Double holder

		for(int testsCompleted = 0; testsCompleted < tests; testsCompleted++){


			for(int iterations = 0; iterations < 10000; iterations++){

				if(iterations == 0){ //If this is the first iteration

					timer.setTime();//Setting timer's start to now
					Functions.funcOne(array);//Running function one, or brute force
					temp = timer.getTime(); //Setting temp to current time
					data[0][0] = temp; //First run through, no comparison just init everything to temp
					data[0][1] = temp;
					data[0][2] = temp;

					timer.setTime();
					Functions.funcTwo(array);
					temp = timer.getTime();
					data[1][0] = temp;
					data[1][1] = temp;
					data[1][2] = temp;

					timer.setTime();
					Functions.funcThree(array);
					temp = timer.getTime();
					data[2][0] = temp;
					data[2][1] = temp;
					data[2][2] = temp;

				} else {//Other wise this is 1...10th execution

					timer.setTime(); //Setting timer's time to now
					Functions.funcOne(array);//Running brute force
					temp = timer.getTime(); //Setting temp to ellapsed time since start
					data[0][0] += temp;//Adding to average. will be divided by number of additions later to get true average
					if( data[0][1] < temp){ //If max is less than temp, give max temp
						data[0][1] = temp;
					} else if ( data[0][2] > temp ){ //If min is greater than temp, give min temp
						data[0][2] = temp;
					}

					timer.setTime();
					Functions.funcTwo(array);
					temp = timer.getTime();
					data[1][0] += temp;
					if( data[1][1] < temp){
						data[1][1] = temp;
					} else if ( data[1][2] > temp ){
						data[1][2] = temp;
					}

					timer.setTime();
					Functions.funcThree(array);
					temp = timer.getTime();
					data[2][0] += temp;
					if( data[2][1] < temp){
						data[2][1] = temp;
					} else if ( data[2][2] > temp ){
						data[2][2] = temp;
					}

				}

			} 

			data[0][0] = data[0][0] / 10000.0; //Dividing averages by iterations, to get true average
			data[1][0] = data[1][0] / 10000.0;
			data[2][0] = data[2][0] / 10000.0;

			System.out.println("-----------------------------------------------");
			print(1, data[0], size); //Printing results of this test
			print(2, data[1], size);
			print(3, data[2], size);


			size = size * rate; //Increasing by the rate
			array = randomGen(size); //New array huray! 
		}
	}
	public static int[] randomGen(int size){

    	if (DEBUG) System.out.println("Random gen = " + size + " ");
    	int[] result = new int[size];
    	Random rand = new Random();
    
    	for(int iterations = 0; iterations < size; iterations++){
      
      		result[iterations] = rand.nextInt(500) + 1; // returns randoms based 1 - 500
     	}
    	return result;
    }
	
	public static void print(int func, Double[] input, int size){
		//Prints out data based on the meaning of each position in the array
		System.out.println("For function #"+func+": of size "+size+" avg = "+input[0]+" max = "+input[1]+" min = "+input[2]); 
	}
}
	