package api.day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.spi.XmlWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 *  �� empList�����е�Emp���󱣴浽myemp.xml�ĵ���
 * 
 *  д��XML�ĵ��Ĵ��²��裺
 *    1.����һDocument�����ʾһ���հ׵�xml�ĵ�
 *    2.��xml����Ӹ�Ԫ��
 *    3.���ն�Ӧ���ɵ�xml�ĵ���ʽ�������Ԫ���������Ԫ�أ��γ�xml�ĵ���ʽ
 *    4.����XmlWriter
 *    5.ͨ��XmlWriter��Documentд��
 */
public class WriteXmlDemo {

	public static void main(String[] args) throws IOException {
		List<Emp4Xml> empList =new ArrayList<Emp4Xml>();
		empList.add(new Emp4Xml(1,"����",22,"��",4000));
		empList.add(new Emp4Xml(1,"����",22,"��",5000));
		empList.add(new Emp4Xml(1,"����",22,"��",6000));
		empList.add(new Emp4Xml(1,"����",22,"��",7000));
		
		XMLWriter xw=null;
		try {
			//1
			Document document=DocumentHelper.createDocument();
			//2
			Element root=document.addElement("list");
			//3
			/**
			 *  Element addElement(String name)
			 *  
			 *  Element addText(String text)
			 *  
			 *  Element addAttribute(String name,String value)
			 */
			for(Emp4Xml emp:empList){
				Element empEle=root.addElement("emp");
				empEle.addElement("name").addText(emp.getName());
				empEle.addElement("age").addText(emp.getAge()+"");				       
				empEle.addElement("gender").addText(emp.getGender());				        
				empEle.addElement("salary").addText(emp.getSalary()+"");
				empEle.addAttribute("id", emp.getId()+"");  
			    			
			}
			//4 
			FileOutputStream fos=new FileOutputStream("./src/api/day12/myemp.xml");
			xw=new XMLWriter(fos,OutputFormat.createPrettyPrint());
			xw.write(document);
			System.out.println("д�����");
			
		} catch (Exception e) {
			
		}finally{
			if(xw!=null){
				try {
					xw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
