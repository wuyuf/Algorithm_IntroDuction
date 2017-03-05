package java_twelve_serialize;


import java.io.File ;
import java.io.FileOutputStream ;
import java.io.OutputStream ;
import java.io.ObjectOutputStream ;




public class serDemo1{
	public static void main(String args[]) throws Exception {
		File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		ObjectOutputStream  oos = null;		//声明对象输出流
		OutputStream out = new FileOutputStream(f) ;	// 文件输出流
		oos = new ObjectOutputStream(out);				//
		oos.writeObject(new Person("zhangsan",40));
		oos.close();
	
	
	
	}

}
