public class Branch{

	private Double value;

	private Branch left;

	private Branch right;

	public void Branch(Double value){
		this.value = value;
	}

	public void setLeft(Branch left){
		this.left = left;
	}

	public void setRight(Branch right){
		this.right = right;
	}

	public Leaf getLeft(Branch left){
		return this.left;
	}

	public Leaf getRight(Branch right){
		return this.right;
	}

	public void setVal(Double value){
		this.value = value;
	}

	public Double getVal(){
		return value;
	}
}