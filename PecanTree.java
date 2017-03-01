//A BST tree optimized for pecans

public class PecanTree{
	public Branch bareRoot; //Root of tree, main parent

	public PecanTree(){
		//Does nothing... 
	}

	public void bud(Double value){ //adds a pecan bud to tree (value)
		if(isBranchEmpty(bareRoot))
			bareRoot = new Branch(value);
		else
			bareRoot = addBranch( value, bareRoot);
	}

	private Branch addBranch(double val, Branch currentBranch ){
		if(isBranchEmpty(currentBranch)){
			currentBranch.setVal(val);
			return currentBranch;
		} else if ( val > currentBranch.getVal()){
			return addBranch(val, currentBranch.getRight());
		} else if ( val < currentBranch.getVal()) {
			return addBranch(val, currentBranch.getLeft());
		} else {
			return addBranch(val, currentBranch.getRight());
		}
	} 

	public Double getMin(){
		return getMin(bareRoot);
	}

	private Double getMin(Branch currentBranch){
		if( currentBranch.getLeft() == null){
			return currentBranch.getVal();
		} else {
			return getMin(currentBranch.getLeft());
		}
	}

	public Double getMax(){
		return getMax(bareRoot);
	}

	private Double getMax(Branch currentBranch){
		if( currentBranch.getRight() == null){
			return currentBranch.getVal();
		} else {
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