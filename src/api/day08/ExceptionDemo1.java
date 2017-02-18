package api.day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java异常捕获机制中的try-catch try是用来扩上可能出错的代码片段 catch块是用来捕获try块中代码抛出的错误并解决
 * 
 * JVM在执行代码时若发现异常，会实例化这个异常， 并将代码整个执行过程设置到异常中来表示错误报告， 设置完毕后将该异常抛出，若异常的代码块有try包围，
 * 则JVM会检查catch中是否有关注异常， 若关注则交给catch解决，否则会将异常抛出到当前方法外， 由调用当前方法的代码解决该异常
 * 
 * 
 * try{ }catch(Exception1 e){ }catch(Exception2 e){ }catch(Exception3 e){
 * }finally{ finally块中的代码一定执行，无论try中的代码是否有异常， 所以通常把释放资源等操作放在finally中，如关闭流 }
 * 
 * @author Administrator
 *
 */
public class ExceptionDemo1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(                           // 字符高级流
					new InputStreamReader(                     // 字节字符转换流
							new FileInputStream("fos.txt")));  // 字节低级流
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
		
	}

}
