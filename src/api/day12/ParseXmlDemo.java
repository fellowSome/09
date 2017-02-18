package api.day12;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *   使用DOM解析xml
  * 
 * @author Administrator
 *
 */
public class ParseXmlDemo {

	public static void main(String[] args) {
		/**
		 *  解析emplist。xml文档，将所有员工的信息读取出来并转换为Emp实例，
		 *  存入一个List集合中
		 *  
		 *  解析xml的流程
		 *    1.创建 SAXReader
		 *    2.使用SAXReader读取xml文档并返回
		 *      Domcument对象
		 *      这一步是DOM解析耗时资源的体现
		 *      因为DOM会将XML文档全部读取并以一个Document对象形式存于内存
		 *      Domcument对象用于描述解析XML文档内容
		 *    3.根据Document对象获取根元素
		 *    4.按照xml的结构从根元素开始逐级获取子元素已达到遍历xml的目的  
		 */
		try {
			//1
			SAXReader reader=new SAXReader();
			
			//2
			Document doc=(Document) reader.read(new FileInputStream("./src/api/day12/emplist.xml"));
			//3
			Element root=doc.getRootElement();
			/**
			 * Element 提供了获取元素的方法
			 * 
			 *  String getName（）
			 *  获取当前标签的名字
			 *  
			 *  List elements（）
			 *  获取当前标签下所有子标签
			 *  
			 *  List elements（String name）
			 *  获取当前标签下所有同名子标签
			 *  
			 *  Element element（String name）
			 *  获取指定名字的子标签
			 *  
			 *  Attribute attribute（String name）
			 *  获取指定名字的属性
			 *  
			 *  String getText（）
			 *  获取当前标签中的文本（前标签和后标签之间的文本信息，前台是确实为文本而不是子标签）
			 *  
			 */
			
			List<Emp4Xml> empList=new ArrayList<Emp4Xml>();
			
			/**
			 *  获取跟标签<list>下所有的子标签<emp>
			 */
			List<Element> elements=root.elements();
			
			/**
			 *  遍历所有<emp>标签并解析出员工相关的信息，并以一个emp实例保存，然后存入empList集合
			 */
			for(Element empEle:elements){
				
				String name=empEle.element("name").getTextTrim(); // 或者 ：String name=empEle.elementText("name");
				String age=empEle.element("age").getTextTrim();
				String gender=empEle.element("gender").getTextTrim();
				String salary=empEle.element("salary").getTextTrim();
				Attribute attr=empEle.attribute(0);
			    String id=attr.getValue();
			    Emp4Xml emp=new Emp4Xml(Integer.parseInt(id),name,Integer.parseInt(age),gender,Integer.parseInt(salary));
			    empList.add(emp);
				
			}
			System.out.println(empList);	 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
