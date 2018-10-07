package com.example;

public class Node {
	Node next;
	String date;
	public Node(String s) {
		next=null;
		this.date=s;
	}
	public String getDate() {
		return date;
	}
}
