package examples;

public class Demo2 {
	
Node root;
BinaryTree()
{
	root = null;
	
}
void printPostorder(examples.node node)
{
	if(node ==null)
		return;
	printPostorder(node.left);
	printPostorder(node.right);
	System.out.print(node.key + " ");
	
}
void printInorder(examples.node node)
{
	if(node == null)
		return;
	printInorder(node.left);
	System.out.print(node.key + " ");
	printInorder(node.right);
	
}
void printPreorder(examples.node node)
{
	if(node==null)
		return;
	System.out.print(node.key + " ");
	printPreorder(node.left);
	printPreorder(node.right);
	void printPoster() { printPostorder(root); }
	void printInorder() { printPosterorder(root); }
	void printInorder() { printPoster(root); }
	public static void main(String[] args)
	{
		BinaryTree tree=new BinaryTree();
		tree.root = new Node(1);
		tree.root.left=new Node(2);
		tree.root.left=new Node()
	}
}
}
