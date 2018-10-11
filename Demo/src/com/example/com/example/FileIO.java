package com.example;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileIO {
	public void register(String qq) {
		//TODO 创建名为qq的ini 内容全部填0
		
	}
	public boolean find(String qq) {
		//TODO 检测是否有名为qq的文件
		return false;
	}
	public Character login(String qq) {
		Character a=new Character(0);
		//TODO 找到指定文本并把内容传给a；
		return a;
		
	}
	public static void main(String[] args) throws IOException {
		//SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		//String date = df.format(new Date());
		//System.out.println(date);
		   //FileInputStream fis=new FileInputStream("aaa.txt");
		  	//FileOutputStream fos=new FileOutputStream("D:\\fileForTest\\bbb.txt",true);//这句直接创建文件
		   //FileOutputStream()后面加true指文件后面可追加
		  File f = new File("D:\\fileForTest\\bbb.txt");
		  try {
			  FileWriter fw=new FileWriter(f);
			  Scanner scanner = new Scanner(System.in);
			  String temp;
			  while(!((temp=scanner.nextLine()).equals("quit"))){
	                fw.write(temp);
	            }
	            fw.close();
		  }catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	
		
		 // fos.write();//write()一次写一个字节
		 // fis.close();//一定记得关闭流，养成好习惯
		  //fos.close();
	}
}