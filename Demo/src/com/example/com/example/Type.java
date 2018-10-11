package com.example;

public class Type {
	//0是不需要@qq不需要恢复 1是不需要@qq需要回复 2是@qq并且需要回复
	int type;
	String str;
	public Type(int inf,String msg) {
		type=inf;
		str=msg;
	}
	public int type() {
		return type;
	}
	public String str() {
		return str;
	}
}
