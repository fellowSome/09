package oo.day06;

import java.util.Scanner;

public class UnionPayTest {

	public static void main(String[] args) {
		/*ICBCImpl icbc=new ICBCImpl(1234,"1234");
		System.out.println("���������룺");
		Scanner sc=new Scanner(System.in);
		String inp=sc.next();
		if(icbc.checkPwd(inp)){
			System.out.println("������ȡ���");
			double mon=sc.nextDouble();
			if(icbc.drawMoney(mon)){
				System.out.println("ȡ��ɹ�������Ϊ��"+icbc.getBalence());
			}else{
				System.out.println("����");
			}
		}else{
			System.out.println("�������");
		}*/
		ABCATM atm=new ABCATM();
		ABCImpl abc=new ABCImpl();
		atm.insertCard(abc);
		atm.payTelBill();
		
	}

}

class ABCATM{
	private UnionPay card;
	public void insertCard(UnionPay card){
		this.card=card;
	}
	public void payTelBill(){
		if(card instanceof ABC){
			 ABC abcCard=(ABC)card;
			 abcCard.payTelBill(500);
		}else{
			System.out.println("����ũ�п����뻻������");
		}
	}
}







interface UnionPay{
	double getBalence();
	boolean checkPwd(String pwd);
	boolean drawMoney(double mon);
}
interface ICBC extends UnionPay{
	void payOnline(double mon);
}
interface ABC extends UnionPay{
	void payTelBill(double mon);
}
class ICBCImpl implements ICBC{
	double money;
	String pwd;
	ICBCImpl(){
		
	}
	ICBCImpl(double money,String pwd){
		this.money=money;
		this.pwd=pwd;
	}
	public double getBalence(){
		return money;
	}
	public boolean checkPwd(String pwd){
		if(this.pwd.equals(pwd))
		{
			return true;
		}
		return false;
		
	}
	public boolean drawMoney(double mon){
		if(money-mon>=0){
			money-=mon;
			return true;
		}
		return false;
	}
	public void payOnline(double mon){
		if(money-mon>0){
			money-=mon;
		}
	}
	
	
}
class ABCImpl implements ABC{
	double money;
	String pwd;
	ABCImpl(){
		
	}
	ABCImpl(double money,String pwd){
		this.money=money;
		this.pwd=pwd;
	}
	public double getBalence(){
		return money;
		
	}
	public boolean checkPwd(String pwd){
		if(this.pwd.equals(pwd))
		{
			return true;
		}
		return false;
		
	}
	public boolean drawMoney(double mon){
		if(money-mon>=-2000){
			money-=mon;
			return true;
		}
		return false;
		
	}
	public void payTelBill(double mon){
		
		if(money-mon>=0){
			money-=mon;
			System.out.println("�ɹ��仰�ѣ�"+mon);
		}	
	}
	
}