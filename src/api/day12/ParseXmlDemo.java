package api.day12;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *   ʹ��DOM����xml
  * 
 * @author Administrator
 *
 */
public class ParseXmlDemo {

	public static void main(String[] args) {
		/**
		 *  ����emplist��xml�ĵ���������Ա������Ϣ��ȡ������ת��ΪEmpʵ����
		 *  ����һ��List������
		 *  
		 *  ����xml������
		 *    1.���� SAXReader
		 *    2.ʹ��SAXReader��ȡxml�ĵ�������
		 *      Domcument����
		 *      ��һ����DOM������ʱ��Դ������
		 *      ��ΪDOM�ὫXML�ĵ�ȫ����ȡ����һ��Document������ʽ�����ڴ�
		 *      Domcument����������������XML�ĵ�����
		 *    3.����Document�����ȡ��Ԫ��
		 *    4.����xml�Ľṹ�Ӹ�Ԫ�ؿ�ʼ�𼶻�ȡ��Ԫ���Ѵﵽ����xml��Ŀ��  
		 */
		try {
			//1
			SAXReader reader=new SAXReader();
			
			//2
			Document doc=(Document) reader.read(new FileInputStream("./src/api/day12/emplist.xml"));
			//3
			Element root=doc.getRootElement();
			/**
			 * Element �ṩ�˻�ȡԪ�صķ���
			 * 
			 *  String getName����
			 *  ��ȡ��ǰ��ǩ������
			 *  
			 *  List elements����
			 *  ��ȡ��ǰ��ǩ�������ӱ�ǩ
			 *  
			 *  List elements��String name��
			 *  ��ȡ��ǰ��ǩ������ͬ���ӱ�ǩ
			 *  
			 *  Element element��String name��
			 *  ��ȡָ�����ֵ��ӱ�ǩ
			 *  
			 *  Attribute attribute��String name��
			 *  ��ȡָ�����ֵ�����
			 *  
			 *  String getText����
			 *  ��ȡ��ǰ��ǩ�е��ı���ǰ��ǩ�ͺ��ǩ֮����ı���Ϣ��ǰ̨��ȷʵΪ�ı��������ӱ�ǩ��
			 *  
			 */
			
			List<Emp4Xml> empList=new ArrayList<Emp4Xml>();
			
			/**
			 *  ��ȡ����ǩ<list>�����е��ӱ�ǩ<emp>
			 */
			List<Element> elements=root.elements();
			
			/**
			 *  ��������<emp>��ǩ��������Ա����ص���Ϣ������һ��empʵ�����棬Ȼ�����empList����
			 */
			for(Element empEle:elements){
				
				String name=empEle.element("name").getTextTrim(); // ���� ��String name=empEle.elementText("name");
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
