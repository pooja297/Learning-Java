
public class BinarySearchTreeNode {
	//constructing the BST
	public int data;
	public BinarySearchTreeNode left, right;
	
	public BinarySearchTreeNode(){
		left = null;
		right = null;
		data = 0;
	}
	public BinarySearchTreeNode(int data){
		this.data = data;
		left = null;
		right = null;
	}
	//set the value of left node
	public void setLeft(BinarySearchTreeNode left){
		this.left = left;
	}
	//get the value of left node
	public BinarySearchTreeNode getLeft(){
		return left;
	}
		
	//set the value of right node
	public void setRight(BinarySearchTreeNode right){
		this.right = right;
	}
	//get the value of left node
	public BinarySearchTreeNode getRight(){
		return right;
	}
	
	//set the value of data node
	public void setData(int data){
		this.data = data;
	}
	//get the value of left node
	public int getData(){
		return data;
	}
			
	public void BSTInsert(int value, BinarySearchTreeNode root){
		if (value < root.data){//will enter LST
			if (root.left != null){//if LSt is not null
				//call recursive insert for LST
				BSTInsert(value,root.left);
			}
			else{
				//set the LST = value
				root.left= new BinarySearchTreeNode(value);
			}
		}
		else if (value > root.data){//enter RST
			if(root.right != null){
				BSTInsert(value, root.right);
			}
			else {
				root.right = new BinarySearchTreeNode(value);
			}
		}
	}
	
	public static  void main(String[] args){
		BinarySearchTreeNode b = new BinarySearchTreeNode(5);
		b.BSTInsert(7, b);
		b.BSTInsert(10, b);
		b.BSTInsert(2, b);
		b.BSTInsert(1, b);
		b.BSTInsert(3, b);
		
		//calling the TreeUsingArrays class
		TreeUsingArrays tree1 = new TreeUsingArrays();
		int TreeRoot = 1;
		tree1.setStringValue(1, "root");
		tree1.setStringValue(tree1.left(TreeRoot), "left");
		tree1.setStringValue(tree1.right(TreeRoot), "right");
		System.out.println("preorder printing******");
		tree1.printPreorder(TreeRoot);
		System.out.println("postorder printing******");
		tree1.printPostorder(TreeRoot);
		System.out.println("inorder printing******");
		tree1.printInorder(TreeRoot);
	}
	
}
