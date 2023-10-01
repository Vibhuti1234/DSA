package dsa_complete.tree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
     BinarySearchTree tree=new BinarySearchTree();
     tree.insert(47);
     tree.insert(21);
     tree.insert(76);
     tree.insert(18);
     tree.insert(27);
     tree.insert(52);
     tree.insert(82);
     boolean isAvailable=tree.contains(53);
     System.out.println(isAvailable);
     System.out.println(tree.breadthFirstSearch().toString());
     System.out.println(tree.depthFirstPreorderTraversal().toString());
     System.out.println(tree.depthFirstPostorderTraversal().toString());
     System.out.println(tree.depthFirstInorderTraversal().toString());




	}

}
