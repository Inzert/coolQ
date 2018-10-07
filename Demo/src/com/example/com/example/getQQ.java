package com.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
//读取指令（demo）---处理指令(stringprocess)--传到制定程序(制定类)--不涉及本地存档直接返回
//									-涉及测检测是否存在QQ----存在则直接读取/输出
//									-不存在则返回须要注册
public class getQQ {
	public static String [] getFileName(String path)
    {
        File file = new File(path);
        String [] fileName = file.list();
        return fileName;
    }
    public static void getAllFileName(String path,ArrayList<String> fileName)
    {
        File file = new File(path);
        File [] files = file.listFiles();
        String [] names = file.list();
        if(names != null)
        fileName.addAll(Arrays.asList(names));
        for(File a:files)
        {
            if(a.isDirectory())
            {
                getAllFileName(a.getAbsolutePath(),fileName);
            }
        }
    }
    public static void main(String[] args)
    {
        String [] fileName = getFileName("D:\\fileForTest");
        String b=".ini";
        for(String name:fileName)
        {
        	String str3=name.replaceAll(b,"");
            System.out.println(str3);
        }
        
       /*
        ArrayList<String> listFileName = new ArrayList<String>(); 
        getAllFileName("D:\\\\fileForTest",listFileName);
        for(String name:listFileName)
        {
            System.out.println(name);
        }*/
         
    }
		
}
	


