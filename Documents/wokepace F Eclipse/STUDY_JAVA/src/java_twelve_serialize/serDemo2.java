package java_twelve_serialize;


import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.io.ObjectInputStream ;




public class serDemo2{
	public static void main(String args[]) throws Exception {
		File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		ObjectInputStream ois = null;			//声明对象输入流
		InputStream input = new FileInputStream(f);				//实例化输入流
		ois = new ObjectInputStream(input);				//实例化对象输入流
		Object obj = ois.readObject();			//读取对象
		ois.close();
		System.out.println(obj) ;

	}
	
}