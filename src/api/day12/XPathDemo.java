package api.day12;

import java.io.FileInputStream;
import java.util.List;

import org.jaxen.XPath;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XPathDemo {

	public static void main(String[] args) {
		try {
			SAXReader reader =new SAXReader();
			FileInputStream fis=new FileInputStream("./src/api/day12/emplist.xml");
			Document doc=reader.read(fis);
			/**
			 *  Document支持使用xpath检索数据
			 *  前提是必须引入jaxen.jar 包
			 */
			String xpath="/list/emp/age";
			List<Element> list=doc.selectNodes("xpath");
			System.out.println(list.size());
			for(Element ele:list){
				System.out.println(ele.getName()+":"+ele.getText());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
