//A BST tree optimized for pecans

public class PecanTree{
	public static final boolean DEBUG = true;

	public Branch bareRoot; //Root of tree, main parent

	public PecanTree(){
		//Does nothing... 
	}

	public void bud(Double value){ //adds a pecan bud to tree (value)
		if(isBranchEmpty(bareRoot)){
			bareRoot = new Branch(value);
			if (DEBUG) System.out.println("New Pecan Tree: branch is empty adding root = " + value);
		}
		else{
			if (DEBUG) System.out.println("Pecan Tree not empty calling addbranch( "+value+" )");
			bareRoot = addBranch( value, bareRoot);
		}
	}

	private Branch addBranch(double val, Branch currentBranch ){
		if (DEBUG) System.out.println("addBranch( " + val + " )");
		if(currentBranch == null){
			if (DEBUG) System.out.println("addBranch( " + val + " ) @ currentBranch is empty, adding");
			currentBranch.setVal(val);
			return currentBranch;
		} else if ( val > currentBranch.getVal()){
			if (DEBUG) System.out.println("addBranch( " + val + " ) is GT " +currentBranch.getVal() + ", moving right");
			return addBranch(val, currentBranch.getRight());
		} else if ( val < currentBranch.getVal()) {
			if (DEBUG) System.out.println("addBranch( " + val + " ) is LT " +currentBranch.getVal() + ", moving left");
			return addBranch(val, currentBranch.getLeft());
		} else {
			if (DEBUG) System.out.println("addBranch( " + val + " ) is EQ " +currentBranch.getVal() + ", moving right");
			return addBranch(val, currentBranch.getRight());
		}
	} 

	public Double getMin(){
		if (DEBUG) System.out.println("Get Min called, public moving to private");
		Double val =  getMin(bareRoot);
		if (DEBUG) System.out.println("Get Min returned");
		return val;
	}

	private Double getMin(Branch currentBranch){
		if( currentBranch.getLeft() == null){
			if (DEBUG) System.out.println("Get Min base case, returning " + currentBranch.getVal());
			return currentBranch.getVal();
		} else {
			if (DEBUG) System.out.println("Get Min calling left");
			return getMin(currentBranch.getLeft());
		}
	}

	public Double getMax(){
		if (DEBUG) System.out.println("Get Max called, public moving to private");
		Double val = getMax(bareRoot);
		if (DEBUG) System.out.println("Get Max returned");
		return val;
	}

	private Double getMax(Branch currentBranch){
		if( currentBranch.getRight() == null){
			if (DEBUG) System.out.println("Get Max Base Case: returning " + currentBranch.getVal());
			return currentBranch.getVal();
		} else {
			if (DEBUG) System.out.println("Get Max calling right");
			return getMax(currentBranch.getRight());
		}
	}


	public Double getAverage(){
		return getSum(bareRoot) / numberOfBranches(bareRoot);
	}

	private Double getSum(Branch currentBranch){
		if ( currentBranch.getLeft() != null) {
			return currentBranch.getVal() + numberOfBranches(currentBranch.getLeft());
		} if ( currentBranch.getRight() != null ){
			return currentBranch.getVal() + numberOfBranches(currentBranch.getRight());
		}

		else return currentBranch.getVal();
	}

	private int numberOfBranches(Branch currentBranch){
		if ( currentBranch.getLeft() != null) {
			return 1 + numberOfBranches(currentBranch.getLeft());
		} if ( currentBranch.getRight() != null ){
			return 1 + numberOfBranches(currentBranch.getRight());
		} else {
			 return 1;
		}
	}

	private boolean isBranchEmpty( Branch emptyBranch){ //Returns if the bareRoot is empty
		return bareRoot == null;
	}
	
	private void printTree(Branch currentBranch) {
        if (currentBranch != null) {
            printTree(currentBranch.getRight());
            System.out.print(" " + currentBranch.getVal());
            printTree(currentBranch.getLeft());
        }
    }
}