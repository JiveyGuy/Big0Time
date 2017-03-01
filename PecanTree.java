//A BST tree optimized for pecans

public class PecanTree{
	public Branch bareRoot; //Root of tree, main parent

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