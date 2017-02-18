package day04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args){
		try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection ct=DriverManager.getConnection("jdbc:oracle:thin:@176.46.50.13:1521:oral","xjh","xjh");
			 System.out.println(ct);
			 Statement st=ct.createStatement();	 
			 ResultSet rs=st.executeQuery("select *  from yy");
			 while(rs.next())
			 {
				 System.out.println("yes");
			 }
		}catch(Exception e)
		{
			System.out.println("worng");
		}
	}
        

	

}
