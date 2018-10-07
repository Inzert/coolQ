package com.example;

public class StringProcess {
	//非注册项目 菜单
	//注册项目 签到
	//返回
	 long fromQQ;
	 String msg;
	 boolean ifAt;
	 public StringProcess(long q,String m) {
		 this.fromQQ=q;
		 this.msg=m;
		 this.ifAt=false;
	 }
	 public String slove() {
		 String re="";//这个是将要发给用户的字符
		 int event=-1;//用于检测事件 事件为数字编号 -1则不做动作
		 //这里进行返回要发出的字符串，分为@的 不@的 涉及存档和不涉及 涉及存档需要一个本地存档和读取操作
		 if(msg.indexOf("菜单")!=-1) event=1;//这个显然需要直接回字符串
		 if(msg.indexOf("签到")!=-1) event=2;
		 if(msg.indexOf("查看积分")!=-1) event=3;
		 //2018-9-18 13:00:32 当前功能 查看积分 签到 未注册用户通过签到注册 二者都需要存档 
		
		 switch (event) {
		 case 1:
		     re="====功能=====\n签到\n查看积分";
		     break;
		 case 2:
		     System.out.println(2);
		     break;
		 case 3:
		     System.out.println(3);
		     break;
		 default:
		     
		 }
		
		 return re;
	 }
	 
	 public void menu() {
		 
	 }
}
