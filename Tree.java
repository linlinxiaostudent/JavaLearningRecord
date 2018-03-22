package niuke;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private Node root;
	private List<Node> list = new ArrayList<>();

	// public Tree(Node root, List<Node> list) {
	// super();
	// this.root = root;
	// this.list = list;
	// }
	public Tree() {
		Node x = new Node("X", null, null);
		Node y = new Node("Y", null, null);
		Node d = new Node("D", x, y);
		Node e = new Node("E", null, null);
		Node f = new Node("F", null, null);
		Node c = new Node("C", e, f);
		Node b = new Node("B", d, null);
		Node a = new Node("A", b, c);
		root = a;
	}

	public List<Node> getResult() {
		return list;
	}

	public void preOrder(Node node) {
		list.add(node);
		if (node.getLchild() != null) {
			preOrder(node.getLchild());
		}
		if (node.getRchild() != null) {
			preOrder(node.getRchild());
		}
	}
	
	public void postOrder(Node node) {
		if (node.getLchild()!= null){
			postOrder(node.getLchild());
		}
		if(node.getRchild()!= null){
			postOrder(node.getRchild());
		}
		list.add(node);
	}
	public void inOrder(Node node) {
		if (node.getLchild()!= null){
			inOrder(node.getLchild());
		}
		list.add(node);
		
		if(node.getRchild()!= null){
			inOrder(node.getRchild());
		}
		
	}
	
	public static void main(String[] args) {
		Tree  tree = new Tree();
		System.out.println("根节点是："+tree.root.getData());
//		tree.preOrder(tree.root);
//		tree.postOrder(tree.root);
		tree.inOrder(tree.root);
		for(Node node: tree.getResult()){
			System.out.print(node.getData()+"\t");
		}
		
	}

}

class Node {
	private String data;
	private Node lchild;
	private Node rchild;

	public Node(String data, Node lchild, Node rchild) {
		super();
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getLchild() {
		return lchild;
	}

	public void setLchild(Node lchild) {
		this.lchild = lchild;
	}

	public Node getRchild() {
		return rchild;
	}

	public void setRchild(Node rchild) {
		this.rchild = rchild;
	}

}
