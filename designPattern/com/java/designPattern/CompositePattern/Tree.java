package com.java.designPattern.CompositePattern;

public class Tree {
	TreeNode node=null;
	
	public Tree(String name){
		node=new TreeNode(name);
	}
	
	
	public static void main(String[] args) {
		Tree A=new Tree("A");
		TreeNode NB=new TreeNode("B");
		TreeNode NC=new TreeNode("C");
		NB.add(NC);
		A.node.add(NB);
		System.out.println("OjbK");
	}
}
