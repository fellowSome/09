package api.day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java�쳣��������е�try-catch try���������Ͽ��ܳ���Ĵ���Ƭ�� catch������������try���д����׳��Ĵ��󲢽��
 * 
 * JVM��ִ�д���ʱ�������쳣����ʵ��������쳣�� ������������ִ�й������õ��쳣������ʾ���󱨸棬 ������Ϻ󽫸��쳣�׳������쳣�Ĵ������try��Χ��
 * ��JVM����catch���Ƿ��й�ע�쳣�� ����ע�򽻸�catch���������Ὣ�쳣�׳�����ǰ�����⣬ �ɵ��õ�ǰ�����Ĵ��������쳣
 * 
 * 
 * try{ }catch(Exception1 e){ }catch(Exception2 e){ }catch(Exception3 e){
 * }finally{ finally���еĴ���һ��ִ�У�����try�еĴ����Ƿ����쳣�� ����ͨ�����ͷ���Դ�Ȳ�������finally�У���ر��� }
 * 
 * @author Administrator
 *
 */
public class ExceptionDemo1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(                           // �ַ��߼���
					new InputStreamReader(                     // �ֽ��ַ�ת����
							new FileInputStream("fos.txt")));  // �ֽڵͼ���
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
		
	}

}
