public class Branch{

	private Double value;

	private Branch left;

	private Branch right;

	public Branch(Double value){
		this.value = value;
	}

	public void setLeft(Branch left){
		this.left = left;
	}

	public void setRight(Branch right){
		this.right = right;
	}

	public Branch getLeft(){
		return this.left;
	}

	public Branch getRight(){
		return this.right;
	}

	public void setVal(Double value){
		this.value = value;
	}

	public Double getVal(){
		return value;
	}
}