package com.example;

import javax.swing.JOptionPane;

import com.sobte.cqp.jcq.entity.Anonymous;
import com.sobte.cqp.jcq.entity.CQDebug;
import com.sobte.cqp.jcq.entity.GroupFile;
import com.sobte.cqp.jcq.entity.ICQVer;
import com.sobte.cqp.jcq.entity.IMsg;
import com.sobte.cqp.jcq.entity.IRequest;
import com.sobte.cqp.jcq.event.JcqAppAbstract;

public class PrivateMSG extends JcqAppAbstract implements ICQVer, IMsg, IRequest{
	int subType,msgId,font;
	long fromQQ;
	String msg;
	public void test() {
		
	}
	public static void main(String[] args) {
		
	}
	@Override
	public int startup() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int exit() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int enable() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int disable() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int privateMsg(int subType, int msgId, long fromQQ, String msg, int font) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int groupMsg(int subType, int msgId, long fromGroup, long fromQQ, String fromAnonymous, String msg,
			int font) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int discussMsg(int subtype, int msgId, long fromDiscuss, long fromQQ, String msg, int font) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int groupUpload(int subType, int sendTime, long fromGroup, long fromQQ, String file) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int groupAdmin(int subtype, int sendTime, long fromGroup, long beingOperateQQ) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int groupMemberDecrease(int subtype, int sendTime, long fromGroup, long fromQQ, long beingOperateQQ) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int groupMemberIncrease(int subtype, int sendTime, long fromGroup, long fromQQ, long beingOperateQQ) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int friendAdd(int subtype, int sendTime, long fromQQ) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int requestAddFriend(int subtype, int sendTime, long fromQQ, String msg, String responseFlag) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int requestAddGroup(int subtype, int sendTime, long fromGroup, long fromQQ, String msg,
			String responseFlag) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String appInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
