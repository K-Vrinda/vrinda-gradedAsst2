package question2;

class Node{
	int value;
	Node left, right;
	
	Node(int value){
		this.value = value;
		this.left = this.right = null;
	}
}

class MNCTransactionsMain{
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void BSTToSkewed(Node root) {
		if(root == null) {
			return;
		}

		BSTToSkewed(root.left);
		Node rightNode = root.right;
	
		if(headNode == null){
			headNode = root;
			root.left = null;
			prevNode = root;
		}else{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		BSTToSkewed(rightNode);
	}

	static void traverseRightSkewed(Node root){
		if(root == null) {
			return;
		}
		System.out.print(root.value + " ");
		traverseRightSkewed(root.right);	
	}
	
	public static void main (String[] args){
		MNCTransactionsMain tree = new MNCTransactionsMain();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);		
		
		BSTToSkewed(node);
		traverseRightSkewed(headNode);
	}
}

