package com.example;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class TestFileWriterReader {
	public static void main(String[] args) throws IOException {
		long userQQ=346142205;
		//String qq=(String)userQQ;
		String file="D:/fileFortest/"+userQQ+".ini";
		String charSet="UTF-8";
		//写字符转换成字节流
		FileOutputStream fileWriter=new FileOutputStream(file);
		OutputStreamWriter writer=new OutputStreamWriter(fileWriter, charSet);
		try {
			writer.write("这个坑是346142205的");
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			writer.close();
		}
		//读取字节转换到字符
		/*FileInputStream fileInputStream=new FileInputStream(file);
		InputStreamReader reader=new InputStreamReader(fileInputStream, charSet);
		StringBuilder builder=new StringBuilder();
		char [] buf=new char[64];
		int count=0;
		try {
			while ((count = reader.read(buf)) != -1) {
				builder.append(buf,0,count);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			reader.close();
		}
		System.out.println(builder.toString());*/
	}
}