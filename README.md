COSC2336 - Lab 3

Studdy the impact of O() on a problem solution and learn to design and tweak an experiment:
1 - Use the 3 different algorithms for Maximum Contiguous Subsequence Sum, you can copy the code from http://www.crazyforcode.com/maximum-sum-in-contiguous-subarray/ - Give credit. You will need to tweak the code to make it work. You can also simplify the code...
2 - Use StopWatch class from the book for timing
3 - Build a tester that:
  * Generates datasets randomly
  * Run all 3 algorithm with each generated dataset
  * You will need multiple test-runs to establish N such that value of T(N) are neither too short (Resolution is mili-second) or too long (Longer than ~ 1 day)
  * Initially loop multiplying the dataset size by 2 (Initial multiplier) every time
4 - Follow the analysis of experimental data from the book page 176. Plot the data using excel
5 - From this estimate a good starting N and increment such that your table will have at least 4 lines with all 3 results
6 - Run the test and repeat 10 times to obtain an average (you can test with other work-load present or computer idle)
7 - Build a table that shows N vs. average / minimum / maximum T(N) for all 3 algorithms
8 - Turn a professional looking report:
  a. describes the experiment
  b. include the code
  c. include a sample run
  d. explain the final set of numbers you used (starting size and multiplier and time cut-off)
  e. explain the findings
  f. estimate the constant factors for all 3 algorithms assuming aN-cube, bN-square, and cN. 
9 - Turn in your code (.java) and the report via e-mail to epcc.fblando@gmail.com
