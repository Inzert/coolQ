package com.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

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
	


