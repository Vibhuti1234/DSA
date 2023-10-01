package dsa_complete.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
	
	private  Node root;   
	
	public class Node {
		int value;
		Node left;
		Node right;
		private Node(int value) {
			this.value = value;
		}

		}
	
	public boolean insert(int value) {
		Node newNode=new Node(value);
		if(root==null) {
			root=newNode;
			return true;
		}
		Node temp=root;
		while (true) {
			if (newNode.value==temp.value) {
				return false;
				
			}
			if(newNode.value<temp.value) {
				if(temp.left==null)
				{
					temp.left=newNode;
					return true;
				}
				
				temp=temp.left;
			}
			else {
				if(temp.right==null) {
					temp.right=newNode;
					return true;
				}
				temp=temp.right;
			}
			
		}
				
	}

	public boolean contains(int element) {
		if (root==null) {
			return false;
			
		}
		Node temp=root;
		while (temp!=null) {
			if(element<temp.value) {
				temp=temp.left;
			}
			else if (element>temp.value) {
				temp=temp.right;
				
			}
			else {
				return true;
			}
			
		}
		return false;
	}
	
	public List<Integer> breadthFirstSearch(){
		Queue<Node> queue=new LinkedList<Node>();
		Node currentNode=root;
		List<Integer> results=new ArrayList<>();
			queue.add(currentNode);
			while (queue.size()>0) {
				currentNode=queue.remove();
				results.add(currentNode.value);
				if(currentNode.left!=null) {
				queue.add(currentNode.left);	
				}
				if (currentNode.right!=null) {
					queue.add(currentNode.right);
				}
			}
			return results;
	}
	
	public List<Integer> depthFirstPreorderTraversal() {
		List<Integer> results=new ArrayList<>();
		class Traverse{
		 Traverse(Node currentNode) {
			 results.add(currentNode.value);
			 if(currentNode.left!=null) {
				 new Traverse(currentNode.left);
				 
			 }
			 if(currentNode.right!=null) {
				 new Traverse(currentNode.right);
				 
			 }

			}
		}
		new Traverse(root);
		return results;
		
	}
	public List<Integer> depthFirstPostorderTraversal() {
		List<Integer> results=new ArrayList<>();
		class Traverse{
		 Traverse(Node currentNode) {
			 if(currentNode.left!=null) {
				 new Traverse(currentNode.left);
				 
			 }
			 if(currentNode.right!=null) {
				 new Traverse(currentNode.right);
				 
			 }
			 results.add(currentNode.value);
			}
		}
		new Traverse(root);
		return results;
		
	}
	public List<Integer> depthFirstInorderTraversal() {
		List<Integer> results=new ArrayList<>();
		class Traverse{
		 Traverse(Node currentNode) {
			 if(currentNode.left!=null) {
				 new Traverse(currentNode.left);
				 
			 }
			 results.add(currentNode.value);
			 if(currentNode.right!=null) {
				 new Traverse(currentNode.right);
				 
			 }
			}
		}
		new Traverse(root);
		return results;
		
	}

	


}
