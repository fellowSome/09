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
 *  将 empList集合中的Emp对象保存到myemp.xml文档中
 * 
 *  写出XML文档的大致步骤：
 *    1.创建一Document对象表示一个空白的xml文档
 *    2.向xml中添加跟元素
 *    3.按照对应生成的xml文档格式，逐级向根元素中添加子元素，形成xml文档格式
 *    4.创建XmlWriter
 *    5.通过XmlWriter将Document写出
 */
public class WriteXmlDemo {

	public static void main(String[] args) throws IOException {
		List<Emp4Xml> empList =new ArrayList<Emp4Xml>();
		empList.add(new Emp4Xml(1,"张三",22,"男",4000));
		empList.add(new Emp4Xml(1,"李四",22,"男",5000));
		empList.add(new Emp4Xml(1,"王五",22,"男",6000));
		empList.add(new Emp4Xml(1,"周六",22,"男",7000));
		
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
			System.out.println("写出完毕");
			
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
