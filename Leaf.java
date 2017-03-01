public class Leaf{

	private Double value;

	private Leaf left;

	private Leaf right;

	public Leaf(Double value){
		this.value = value;
	}

	public setLeft(Leaf left){
		this.left = left;
	}

	public setRight(Leaf right){
		this.right = right;
	}

	public getLeft(Leaf left){
		return this.left;
	}

	public getRight(Leaf right){
		return this.right;
	}
}